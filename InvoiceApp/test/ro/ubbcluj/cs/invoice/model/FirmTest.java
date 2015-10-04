package ro.ubbcluj.cs.invoice.model;

import junit.framework.TestCase;
import ro.ubbcluj.cs.invoice.factory.Factory;

public class FirmTest extends TestCase{
	
	public void testCreate(){
		Firm firm = Factory.createFirm();
		assertEquals(Factory.FIRMSRL, firm.getName());
		assertEquals(Factory.ADDRESS1,firm.getAddress());
	}

}
