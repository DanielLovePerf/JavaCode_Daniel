package DaDaCarSystem;

public abstract class Car {
	public int pLoad;
	public int cLoad;
	public int price;
	public void showInfor(){
		
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
	

}
