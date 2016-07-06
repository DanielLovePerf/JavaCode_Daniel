package DaDaCarSystem;

public class PickupCar extends Car {
	public String name;
	private int pLoad;
	private int cLoad;
	private int price;
	
	public PickupCar(String newName,int newPrice,int newpLoad,int newcLoad){
		name=newName;
		price=newPrice;
		pLoad=newpLoad;
		cLoad=newcLoad;
	}
	
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int newPrice){
		price=newPrice;
	}
	
	public int getpLoad(){
		return pLoad;
	}
	
	public void setpLoad(int newpLoad){
		pLoad=newpLoad;
	}
	
	public int getcLoad(){
		return cLoad;
	}
	
	public void setcLoad(int newcLoad){
		cLoad=newcLoad;
	}
	
	public void showInfor(){
		System.out.println(name+" "+price+" 元/天   载人："+pLoad+"人   载物："+cLoad+"吨");
	}

}
