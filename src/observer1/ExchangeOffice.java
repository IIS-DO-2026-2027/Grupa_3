package observer1;

public class ExchangeOffice implements Observer {
	private double eurPrice;
	private double usdPrice;

	@Override
	public void update(double eurPrice, double usdPrice) {
		this.eurPrice = eurPrice;
		this.usdPrice = usdPrice;
		
		sendSMS();
	}
	
	public void sendSMS() {
		System.out.println("New price of EUR is: " + eurPrice);
		System.out.println("New price of USD is: " + usdPrice);
	}

}
