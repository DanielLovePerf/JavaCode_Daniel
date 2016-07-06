package DaDaCarSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Initial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//�������г�����Ϣ	
		Car[] carlist={new MiniCar("�µ�A4",500,4),
				new MiniCar("���Դ�",400,4),
				new PickupCar("Ƥ��ѩ6",450,4,2),
				new MiniCar("����",800,20),
				new Truck("�ɻ���",400,4),
				new Truck("��ά��",1000,20)};
	//��ʾ�⳵��Ϣ	
		System.out.print("��ӭʹ�ô���⳵ϵͳ��");
		System.out.print("���Ƿ�Ҫ�⳵��1 �� 0 ��"+'\t');
		Scanner sc = new Scanner(System.in);
		int tag=0;
		try{
			tag = sc.nextInt();
		}catch(InputMismatchException e){
			System.out.println("����������������� 1 �� 0");
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}finally{
			System.out.println("ϵͳ�׳��쳣�ˣ�");
		}

		if(tag!=1){
			System.out.println("�˳���");
		}else{			
			System.out.println("�����⳵�����ͼ����Ŀ��");
	//		System.out.println("���, ��������,  ���,   ������");
			System.out.println("���" + '\t' + "��������" + '\t' + "���" + '\t' +"����");
	
			for(int x=0;x<carlist.length;x++){
				System.out.print((x+1)+".\t");
				carlist[x].showInfor();
			}		
	

		// �����⳵����������
		System.out.print("��������Ҫ�⳵������������"+'\t');
		int num = sc.nextInt();
		Car[] chooseCar = new Car[num];
		
		for(int i=0;i<num;i++){
			System.out.println("�������"+(i+1)+"��������ţ�"+'\t');
			int choose = sc.nextInt();
			if(choose>carlist.length){
				System.out.println("���������Ų����ڣ����������룺");
				num++;
			}else{
			chooseCar[i] = carlist[choose-1];
			}
		}
		
		for(int i=0;i<chooseCar.length;i++){
			System.out.println("������ĳ�Ϊ��");
			chooseCar[i].showInfor();
		}
		
		//��ʼ���˵�����
		System.out.println("���������⳵��������"+'\t');
		int days = sc.nextInt();
		int priceTotal=0;
		int loadTotal=0;
		int peopleTotal=0;

		//�����⳵�ܼ۸�
		for(int i=0;i<chooseCar.length;i++){
			priceTotal=priceTotal+chooseCar[i].getPrice();
		}
		
		//����������������,ע���еĳ���ֻ�����˻��ػ�
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
		
//		//������������
//		for(int i=0;i<chooseCar.length;i++){
//			peopleTotal=peopleTotal+chooseCar[i].getpLoad();
//		}
			
		//�����˵���Ϣ
		System.out.println("�����˵���");
		System.out.println("���⳵�ܼ۸�Ϊ��"+(priceTotal*days)+"Ԫ");
		System.out.println("���⳵���ؿ���Ϊ��"+(peopleTotal*days)+"��");
		System.out.println("���⳵��������Ϊ��"+(loadTotal*days)+"��");
		sc.close();
		
		}
		
	}
	
	
}
