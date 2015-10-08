package ro.ubbcluj.cs.invoice;

import ro.ubbcluj.cs.invoice.repository.ClientRepository;
import ro.ubbcluj.cs.invoice.repository.FirmRepository;
import ro.ubbcluj.cs.invoice.repository.InvoiceRepository;
import ro.ubbcluj.cs.invoice.service.InvoiceManager;
import ro.ubbcluj.cs.invoice.ui.InvoiceUI;

public class InvoiceApp {

	public static void main(String[] args) {
		
		if (args.length == 0){
			System.out.println("Parameter invalid!");
			System.exit(1);
		}
//		String name = args[0];
		try{
			InvoiceUI invoiceUI = new InvoiceUI();
			InvoiceManager invoiceManager = new InvoiceManager();
			invoiceUI.setInvoiceManager(invoiceManager);
			invoiceManager.setFirmRepository(new FirmRepository());
			invoiceManager.setClientRepository(new ClientRepository());
			invoiceManager.setInvoiceRepository(new InvoiceRepository());
			invoiceUI.startApp();
		}
		catch (Exception e){
			System.out.println("There was an error!");
		}
	}
}
