package ro.ubbcluj.cs.invoice.repository;

import java.util.ArrayList;

import ro.ubbcluj.cs.invoice.model.Firm;

public class FirmRepository {

	private ArrayList<Firm> firmRepository = new ArrayList<Firm>();

	public void add(Firm firm) {
		firmRepository.add(firm);
	}
	
	public int numberOfFirms(){
		return firmRepository.size();
		
	}

}
