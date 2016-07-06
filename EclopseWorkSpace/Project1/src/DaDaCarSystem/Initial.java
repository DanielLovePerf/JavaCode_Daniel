package DaDaCarSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Initial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//定义所有车的信息	
		Car[] carlist={new MiniCar("奥迪A4",500,4),
				new MiniCar("马自达",400,4),
				new PickupCar("皮卡雪6",450,4,2),
				new MiniCar("金龙",800,20),
				new Truck("松花江",400,4),
				new Truck("依维柯",1000,20)};
	//显示租车信息	
		System.out.print("欢迎使用答答租车系统：");
		System.out.print("您是否要租车：1 是 0 否"+'\t');
		Scanner sc = new Scanner(System.in);
		int tag=0;
		try{
			tag = sc.nextInt();
		}catch(InputMismatchException e){
			System.out.println("输入错误，请输入整数 1 或 0");
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}finally{
			System.out.println("系统抛出异常了！");
		}

		if(tag!=1){
			System.out.println("退出！");
		}else{			
			System.out.println("您可租车的类型及其价目表：");
	//		System.out.println("序号, 汽车名称,  租金,   容量：");
			System.out.println("序号" + '\t' + "汽车名称" + '\t' + "租金" + '\t' +"容量");
	
			for(int x=0;x<carlist.length;x++){
				System.out.print((x+1)+".\t");
				carlist[x].showInfor();
			}		
	

		// 输入租车数量及类型
		System.out.print("请输入您要租车的汽车数量："+'\t');
		int num = sc.nextInt();
		Car[] chooseCar = new Car[num];
		
		for(int i=0;i<num;i++){
			System.out.println("请输入第"+(i+1)+"辆车的序号："+'\t');
			int choose = sc.nextInt();
			if(choose>carlist.length){
				System.out.println("您输入的序号不存在，请重新输入：");
				num++;
			}else{
			chooseCar[i] = carlist[choose-1];
			}
		}
		
		for(int i=0;i<chooseCar.length;i++){
			System.out.println("您所租的车为：");
			chooseCar[i].showInfor();
		}
		
		//初始化账单变量
		System.out.println("请输入您租车的天数："+'\t');
		int days = sc.nextInt();
		int priceTotal=0;
		int loadTotal=0;
		int peopleTotal=0;

		//计算租车总价格
		for(int i=0;i<chooseCar.length;i++){
			priceTotal=priceTotal+chooseCar[i].getPrice();
		}
		
		//计算载物载人总量,注意有的车型只能载人或载货
		for(int i=0;i<chooseCar.length;i++){
			if(chooseCar[i] instanceof MiniCar){
				peopleTotal=peopleTotal+chooseCar[i].getpLoad();
			}
			
			if(chooseCar[i] instanceof Truck){
				loadTotal=loadTotal+chooseCar[i].getcLoad();
			}
			
			if(chooseCar[i] instanceof PickupCar){
				peopleTotal=peopleTotal+chooseCar[i].getpLoad();
				loadTotal=loadTotal+chooseCar[i].getcLoad();
			}
		}
		
//		//计算载入总量
//		for(int i=0;i<chooseCar.length;i++){
//			peopleTotal=peopleTotal+chooseCar[i].getpLoad();
//		}
			
		//计算账单信息
		System.out.println("您的账单：");
		System.out.println("您租车总价格为："+(priceTotal*days)+"元");
		System.out.println("您租车总载客量为："+(peopleTotal*days)+"人");
		System.out.println("您租车中载物量为："+(loadTotal*days)+"吨");
		sc.close();
		
		}
		
	}
	
	
}
