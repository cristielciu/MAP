package ro.ubbcluj.cs.invoice.repository;

import java.util.ArrayList;

import ro.ubbcluj.cs.invoice.model.Firm;
import ro.ubbcluj.cs.invoice.utils.DuplicateFirmError;
import ro.ubbcluj.cs.invoice.utils.InvalidFirmDelete;

public class FirmRepository {

	private ArrayList<Firm> firmRepository = new ArrayList<Firm>();

	public void add(Firm firm) throws DuplicateFirmError {
		for(Firm f: firmRepository){
			if(f.getName().toLowerCase().equals(firm.getName().toLowerCase())){
				throw new DuplicateFirmError("The firm with the given name already exists!");
			}
		}
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

	public boolean update(Firm firm) throws InvalidFirmDelete {
		// TODO Auto-generated method stub
		for(Firm f: firmRepository){
			if (f.getName().toLowerCase().equals(firm.getName().toLowerCase())){
				Firm savedFirm = f;
				firmRepository.remove(f);
				savedFirm.setFirmAddress(firm.getAddress());
				firmRepository.add(savedFirm);
				return true;
			}
		}
		throw new InvalidFirmDelete("The firm with the given name wasn\'t found");
	}

}
