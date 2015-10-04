package ro.ubbcluj.cs.invoice.service;

import java.util.HashMap;

import ro.ubbcluj.cs.invoice.model.Firm;
import ro.ubbcluj.cs.invoice.repository.ClientRepository;
import ro.ubbcluj.cs.invoice.repository.FirmRepository;
import ro.ubbcluj.cs.invoice.repository.InvoiceRepository;

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

	public void addFirm(HashMap<String, String> firmData) {
		Firm firm = new Firm();
		firm.setFirmName(firmData.get("FirmName"));
		firm.setFirmAddress(firmData.get("FirmData"));
		firmRepo.add(firm);
	}

}
