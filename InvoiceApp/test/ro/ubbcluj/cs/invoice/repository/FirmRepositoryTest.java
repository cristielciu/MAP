package ro.ubbcluj.cs.invoice.repository;

import junit.framework.TestCase;
import ro.ubbcluj.cs.invoice.factory.Factory;
import ro.ubbcluj.cs.invoice.model.Firm;

public class FirmRepositoryTest extends TestCase{
	
	public void testCreate(){
		FirmRepository repo = new FirmRepository();
		assertEquals(repo.numberOfFirms(),0);
	}
	
	public void testAdd(){
		FirmRepository repo = new FirmRepository();
		Firm firm = Factory.createFirm();
		repo.add(firm);
		assertEquals(repo.numberOfFirms(), 1);
	}

}
