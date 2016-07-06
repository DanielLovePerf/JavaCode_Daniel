package DaDaCarSystem;

public class Truck extends Car {
	public String name;
	private int cLoad;
	private int price;
	
//	public Truck(String newName,int newPrice,int newcLoad){
//		name=newName;
//		price=newPrice;
//		cLoad=newcLoad;
//	}
	
	public Truck(String name,int price,int cLoad){
		this.name=name;
		this.price=price;
		this.cLoad=cLoad;
	}
	
	public int getPrice(){
		return this.price;
	}

	public void setPrice(int price){
		this.price=price;
	}

	public int getcLoad(){
		return this.cLoad;
	}

	public void setcLoad(int cLoad){
		this.cLoad=cLoad;
	}


	public void showInfor(){
		
		System.out.println(this.name+"   "+this.price+"‘™/ÃÏ"+"   "+"‘ÿ»À£∫"+this.cLoad+"∂÷");
	}

}
