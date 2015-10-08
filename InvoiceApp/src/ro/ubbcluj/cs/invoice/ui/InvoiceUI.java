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
		while (true) {
			desplayMenu();
			String str = input();
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
			try{
				invoiceManagerUI.addFirm(getFirmData());
				System.out.println("Firm added!");
			}catch(Exception e){
				System.out.println("Error");
			}
		}
		else if(comand == 2){
			desplayFirms();
		}else if(comand == 3){
			try{
				invoiceManagerUI.deleteFirm(getFirmName());
				System.out.println("Firm was removed!\n");
			}catch (Exception e){
				System.out.println("Error!");
				System.out.println(e.getMessage());
			}
		}
	}

	private String getFirmName() {
		System.out.print("Firm name: ");
		String s = input();
		return s;
	}

	private String input() {
		scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	private void desplayFirms() {
		String firms = invoiceManagerUI.getFirms();
		System.out.println("Firms: \n");
		System.out.println(firms);
	}

	private HashMap<String, String> getFirmData() {
		HashMap<String, String> firmDataMap = new HashMap<String, String>();
		System.out.print("Firm name: ");
		String str = input();
		firmDataMap.put("FirmName", str);
		System.out.print("Firm address:");
		str = input();
		firmDataMap.put("FirmAddress", str);
		return firmDataMap;
	}

	private void desplayMenu() {
		System.out.println("~~~Meniu~~~\n");
		System.out.println("1.Add new Firm.");
		System.out.println("2.Print Firms.");
		System.out.println("3.Remove Firm.");
		System.out.println("0.Exit");
		System.out.print("\nComand: ");
	}

}
