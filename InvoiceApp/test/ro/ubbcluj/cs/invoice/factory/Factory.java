package ro.ubbcluj.cs.invoice.factory;

import ro.ubbcluj.cs.invoice.model.Firm;

public class Factory {
	
	public static final String FIRMSRL = "Firm-S.R.L" ;
	
	public static final String ADDRESS1 = "Address 1" ;
	
	public static Firm createFirm(){
		Firm firm = new Firm();
		firm.setFirmName(FIRMSRL);
		firm.setFirmAddress(ADDRESS1);
		return firm;
	}

}
