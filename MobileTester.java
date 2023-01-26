package mobileApp;

public class MobileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile jimMobile = new Mobile("PAYG", "iPhone 7", "07712442442");
		System.out.println("Account type: " + jimMobile.getAccType());
		System.out.println("Device : " + jimMobile.getDevice());
		System.out.println("Number : " + jimMobile.getNumber());
		System.out.println("Balance : " + jimMobile.getBalance());
		
		jimMobile.addCredit(10.00); 
		System.out.println("\nCredit Successful for \n Number: " + jimMobile.getNumber() 
		+ "\n Balance: " + jimMobile.getBalance()); 
		jimMobile.makeCall(15); 
		System.out.println("\nCall made for \n Number: " + jimMobile.getNumber() 
		+ "\n Balance: " + jimMobile.getBalance()); 
		jimMobile.sendText(2); 
		System.out.println("\nText sent for \n Number: " + jimMobile.getNumber() 
		+ "\n Balance: " + jimMobile.getBalance()); 
		
		Mobile aodhanMobile = new Mobile("PAYG", "iPhone 11", "083123456789");
		System.out.println();
		
		System.out.println("Account type: " + aodhanMobile.getAccType());
		System.out.println("Device : " + aodhanMobile.getDevice());
		System.out.println("Number : " + aodhanMobile.getNumber());
		System.out.println("Balance : " + aodhanMobile.getBalance());
		
		
		aodhanMobile.addCredit(69.00);
		System.out.println("\nCredit Successful for \n Number: " + aodhanMobile.getNumber()
		+ "\n Balance: " + aodhanMobile.getBalance()); 
		
		aodhanMobile.makeCall(8); 
		System.out.println("\nCall made for \n Number: " + aodhanMobile.getNumber() 
		+ "\n Balance: " + aodhanMobile.getBalance()); 
		
		aodhanMobile.sendText(1); 
		System.out.println("\nText sent for \n Number: " + aodhanMobile.getNumber() 
		+ "\n Balance: " + aodhanMobile.getBalance()); 	
		
	}

}
