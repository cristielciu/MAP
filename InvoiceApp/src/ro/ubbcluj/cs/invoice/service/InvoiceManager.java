package ro.ubbcluj.cs.invoice.service;

import java.util.ArrayList;
import java.util.HashMap;

import ro.ubbcluj.cs.invoice.model.Firm;
import ro.ubbcluj.cs.invoice.repository.ClientRepository;
import ro.ubbcluj.cs.invoice.repository.FirmRepository;
import ro.ubbcluj.cs.invoice.repository.InvoiceRepository;
import ro.ubbcluj.cs.invoice.utils.DuplicateFirmError;
import ro.ubbcluj.cs.invoice.utils.InvalidFirmDelete;

public class InvoiceManager {
	private FirmRepository firmRepo;

	public void setFirmRepository(FirmRepository firmRepository) {
		firmRepo = firmRepository;
		
	}

	public void setClientRepository(ClientRepository clientRepository) {
		// TODO Auto-generated method stub
		
	}

	public void setInvoiceRepository(InvoiceRepository invoiceRepository) {
		// TODO Auto-generated method stub
		
	}

	public void addFirm(HashMap<String, String> firmData) throws DuplicateFirmError {
		Firm firm = new Firm();
		firm.setFirmName(firmData.get("FirmName"));
		firm.setFirmAddress(firmData.get("FirmAddress"));
		firmRepo.add(firm);
	}

	public String getFirms() {
		ArrayList<Firm> firms = firmRepo.getAll();
		String firmsStr = "";
		if(firms.isEmpty()){
			firmsStr = "There are no firms added!\n";
		}
		else{

			for(Firm firm : firms){
				firmsStr = firmsStr + "Firm name: " + firm.getName() +"\nFirm address: "+ firm.getAddress() + "\n\n";
			}
		}
		return firmsStr;
	}

	public void deleteFirm(String firmName) throws InvalidFirmDelete {
		firmRepo.delete(firmName);
	}

	public void updateFirm(HashMap<String, String> firmData) throws InvalidFirmDelete {
		Firm firm = new Firm();
		firm.setFirmName(firmData.get("FirmName"));
		firm.setFirmAddress(firmData.get("FirmAddress"));
		firmRepo.update(firm);
		
	}

}
