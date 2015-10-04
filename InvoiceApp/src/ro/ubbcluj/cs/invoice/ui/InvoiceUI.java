package ro.ubbcluj.cs.invoice.ui;

import java.util.HashMap;
import java.util.Scanner;

import ro.ubbcluj.cs.invoice.service.InvoiceManager;

public class InvoiceUI {

	private Scanner scanner;
	private InvoiceManager invoiceManagerUI;

	public void setInvoiceManager(InvoiceManager invoiceManager) {
		invoiceManagerUI = invoiceManager;
	}

	public void startApp() {
		System.out.println("~~~Meniu~~~");
		while (true) {
			desplayMenu();
			scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			int comand = 1;
			try {
				comand = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				System.out.println("The comand you entered is invalid!");
			}
			if (comand == 0){
				System.out.println("Bye Bye!");
				break;
			}
			chooseComand(comand);
		}
	}

	private void chooseComand(int comand) {
		if (comand == 1){
			invoiceManagerUI.addFirm(getFirmData());
		}
	}

	private HashMap<String, String> getFirmData() {
		HashMap<String, String> firmDataMap = new HashMap<String, String>();
		System.out.print("Firm name: ");
		scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		firmDataMap.put("FirmName", str);
		System.out.print("Firm address:");
		scanner = new Scanner(System.in);
		str = scanner.nextLine();
		firmDataMap.put("Firm address", str);
		return firmDataMap;
	}

	private void desplayMenu() {
		System.out.println("1.Add new Firm.");
	}

}
