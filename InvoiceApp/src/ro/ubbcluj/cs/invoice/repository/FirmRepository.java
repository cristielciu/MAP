package ro.ubbcluj.cs.invoice.repository;

import java.util.ArrayList;

import ro.ubbcluj.cs.invoice.model.Firm;
import ro.ubbcluj.cs.invoice.utils.InvalidFirmDelete;

public class FirmRepository {

	private ArrayList<Firm> firmRepository = new ArrayList<Firm>();

	public void add(Firm firm) {
		firmRepository.add(firm);
	}
	
	public int numberOfFirms(){
		return firmRepository.size();
		
	}

	public ArrayList<Firm> getAll() {
		return firmRepository;
	}

	public boolean delete(String firmName) throws InvalidFirmDelete {
		for(Firm f: firmRepository){
			if (f.getName().toLowerCase().equals(firmName.toLowerCase())){
				firmRepository.remove(f);
				return true;
			}
		}
		throw new InvalidFirmDelete("The firm with the given name wasn\'t found");
	}

}
