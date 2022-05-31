package week3.day1.assignments;

public class BankInfo {
	public void saving() {
		System.out.println("Saving...");
	}
	
	public void fixed() {
		System.out.println("Fixed...");
	}
	
	public void deposit() {
		System.out.println("Deposit...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
	}
}

class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Finally Depositing in Axis bank");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ab=new AxisBank();
		ab.deposit();
		 
	}
	
}