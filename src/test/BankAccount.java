package test;

public class BankAccount {
	
	private long 		AccountNumber;
	private double 		Balance;
	private String 		CustomerName;
	private String 		email;
	private String 		PhoneNumber;
	
	public BankAccount(long AccountNumber, double Balance, String CustomerName, String email, String PhoneNumber) {
		
		this.AccountNumber	= AccountNumber;
		this.Balance		= Balance;
		this.CustomerName	= CustomerName;
		this.email			= email;
		this.PhoneNumber	= PhoneNumber;
	}

	public long getAccountNumber() {
		return AccountNumber;
		}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
		}
	public double getBalance() {
		return Balance;
		}
	public String getCustomerName() {
		return CustomerName;
		}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
		}
	public String getEmail() {
		return email;
		}
	public void setEmail(String email) {
		this.email = email;
		}
	public String getPhoneNumber() {
		return PhoneNumber;
		}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
		}
}
