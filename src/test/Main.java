package test;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		BankAccount Saxel = new BankAccount(123832455654L, 1000, "Saxel Park", "saxel@gmail.com", "0723451768");
		BankAccount Baxel = new BankAccount(234832455654L, 2000, "Baxel Park", "Baxel@gmail.com", "0726755968");
		BankAccount Maxel = new BankAccount(345532455654L, 3000, "Maxel Park", "Maxel@gmail.com", "0726305968");
		BankAccount Faxel = new BankAccount(456324555654L, 4000, "Faxel Park", "Faxel@gmail.com", "0726305968");
		BankAccount Zaxel = new BankAccount(567324555654L, 5000, "Zaxel Park", "Zaxel@gmail.com", "0721665968");
		
		BankAccount bank = null;
		
		System.out.println("Enter the person you want to check \n 1 Saxel \n 2 Baxel \n 3 Maxel \n 4 Faxel \n 5 Zaxel");

		String operation = sc.nextLine();
		switch(operation) {
		case "1":
			bank = Saxel;
			System.out.println("Welcome to your Account: \n SAXEL");
			break;
		case "2":
			bank = Baxel;
			System.out.println("Welcome to your Account: \n BAXEL");
			break;
		case "3":
			bank = Maxel;
			System.out.println("Welcome to your Account: \n MAXEL");
			break;
		case "4":
			bank = Faxel;
			System.out.println("Welcome to your Account: \n FAXEL");
			break;
		case "5":
			bank = Zaxel;
			System.out.println("Welcome to your Account: \n ZAXEL");
			break;
		}
		
		System.out.println("------------------------------------------");
		
		
		System.out.println("Enter The Operation Number you wanna do "
				+ "\n 1 = AccountNumber \n 2 = Balance \n 3 = full information \n 4 = Deposit \n 5 = withdrawal");
		String operation1 = sc.nextLine();
		
		switch(operation1) {
		
		case "1":
			System.out.println("Your AccountNumber: " + bank.getAccountNumber());
			break;
		
		case "2":
            System.out.println("Your Balance " + bank.getBalance() + " SEK");
            break;
            
		case "3":
			System.out.println("\n AccountNumber: " + bank.getAccountNumber() + "\n Balance: " + bank.getBalance() + 
					" SEK" + "\n CustomerName: " + bank.getCustomerName() + "\n email: " + bank.getEmail() + 
					"\n PhoneNumber: " + bank.getPhoneNumber());
			break;
			
		case "4":
			System.out.println("Enter The Amount You Wanna Deposit");
			double DepositAmount = sc.nextDouble();
			double NewBalance = bank.getBalance() + DepositAmount;
			System.out.println("Your New Balance " + NewBalance + " SEK");
			break;
			
		case "5":
			System.out.println("Enter The Amount You Wanna withdrawal");
			
			double withdrawalAmount = sc.nextDouble();
			if(withdrawalAmount > bank.getBalance()) {
				System.out.println("insufficient fund ");
			}else {
				
			double NewWithBalance = bank.getBalance() - withdrawalAmount;
			System.out.println("Your new balance is " + NewWithBalance + " SEK");
			}
		}
	}
}