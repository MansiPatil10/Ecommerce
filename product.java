package shopping;

public class product {
	private double id;
	private String productname;
	private double price;
	private String stock;
	
	public product() {
		id = 001;
		productname = "steamer";
		price = 400;
		stock = "available";
	}
	
	

	public double getId() {
		return id;
	}



	public void setId(double id) {
		this.id = id;
	}



	public String getProductname() {
		return productname;
	}



	public void setProductname(String productname) {
		this.productname = productname;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getStock() {
		return stock;
	}



	public void setStock(String stock) {
		this.stock = stock;
	}



	void display() {
		System.out.println("id="+id);
		System.out.println("name : "+productname);
		System.out.println("price : "+price);
		System.out.println("stock : "+stock);
		}

}
