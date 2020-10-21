package shopping;

public class item {
	String productname;
	int price;
	
	item(){
		productname="xxyyzz";
		price=000;
	}
	
	item(String productname,int price){
		this.productname=productname;
		this.price=price;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	void details() {
		System.out.println("productname="+productname);
		System.out.println("price="+price);
	}
}
