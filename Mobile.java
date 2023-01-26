package mobileApp;

public class Mobile {

	private String accType, device, number;
	private double balance;
	final private double CALL_COST = 0.245;
	final private double TEXT_COST = 0.078;

	public Mobile(String accType, String device, String number) {

		this.accType = accType;
		this.device = device;
		this.number = number;
		this.balance = 0.0;

	}

	public void setAccType(String accType) {

		this.accType = accType;

	}

	public void setDevice(String device) {

		this.device = device;

	}

	public void setNumber(String number) {

		this.number = number;

	}

	public void setBalance(double balance) {

		this.balance = balance;

	}

	public String getAccType() {

		return accType;

	}

	public String getDevice() {

		return device;

	}

	public String getNumber() {

		return number;

	}

	public double getBalance() {

		return balance;

	}

	public void addCredit(double amount) {

		balance += amount;

	}

	public void makeCall(int minutes) {

		balance -= minutes * CALL_COST;

	}

	public void sendText(int numOfText) {

		balance -= numOfText * TEXT_COST;

	}

}
