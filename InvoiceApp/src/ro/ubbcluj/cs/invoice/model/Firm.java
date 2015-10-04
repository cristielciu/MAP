package ro.ubbcluj.cs.invoice.model;

public class Firm {
	
	private String name;
	
	private String address;
	
	public Firm(){
	}
	
	public Firm(String Fname, String Faddress){
		name = Fname;
		address = Faddress;
	}

	public void setFirmName(String string) {
		name = string;
	}

	public void setFirmAddress(String string) {
		address = string;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

}
