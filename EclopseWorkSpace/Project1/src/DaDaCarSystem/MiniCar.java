package DaDaCarSystem;

public class MiniCar extends Car {
	public String name;
	private int pLoad;
	private int price;
	
	public MiniCar(String newName,int newPrice,int newpLoad){
		name = newName;
		price = newPrice;
		pLoad = newpLoad;
	}
	
	public int getpLoad(){
		return pLoad;
	}
	
	public void setpLoad(int newpLoad){
		pLoad = newpLoad;
	}
	
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int newPrice){
		price = newPrice;
	}
	
	
	public void showInfor(){
		
		System.out.println(name+"   "+price+"元/天"+"   "+"载人："+pLoad+"人");
	}
	
	//试一下将成员变来那个设置为private，用构造方法初始化是否陈宫

}
