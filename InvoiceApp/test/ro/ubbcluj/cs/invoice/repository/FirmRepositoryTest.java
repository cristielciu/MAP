package ro.ubbcluj.cs.invoice.repository;

import java.util.ArrayList;

import junit.framework.TestCase;
import ro.ubbcluj.cs.invoice.factory.Factory;
import ro.ubbcluj.cs.invoice.model.Firm;
import ro.ubbcluj.cs.invoice.utils.InvalidFirmDelete;

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
	
	public void testGetAll(){
		FirmRepository repo = new FirmRepository();
		ArrayList<Firm> firms = new ArrayList<Firm>();
		assertEquals(repo.getAll(), firms);
		Firm firm = Factory.createFirm();
		repo.add(firm);
		assertEquals(repo.getAll().size(), 1);
	}
	
	public void testRemove() {
		FirmRepository repo = new FirmRepository();
		try{
			repo.delete("asd");
			fail();
		}
		catch (InvalidFirmDelete e){
			assertTrue(true);
		}
		Firm firm = Factory.createFirm();
		repo.add(firm);
		try {
			assertTrue(repo.delete(Factory.FIRMSRL));
		} catch (InvalidFirmDelete e) {
			fail();
		}
	}

}
