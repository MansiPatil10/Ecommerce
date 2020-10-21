package shopping;

public class costumer {
	private int id;
	private String firstname;
	private String lastname;
	private String address;
	private String mobileno;

	
	costumer(){
		id=0000;
		firstname="aaaa";
		lastname="bbbb";
		address="xyz";
		mobileno="987654321";
	}
	
	public costumer(int id,String firstname,String lastname,String address,String mobileno){
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
		this.mobileno=mobileno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	void showdetails() {
		System.out.println("id == "+id);
		System.out.println("firstname == "+firstname);
		System.out.println("lastname == "+lastname);
		System.out.println("address == "+address);
		System.out.println("mobileno == "+mobileno);
}
}
