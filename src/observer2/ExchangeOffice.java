package observer2;

import java.util.Observable;
import java.util.Observer;

public class ExchangeOffice implements Observer {
	private double eurPrice;
	private double usdPrice;

	@Override
	public void update(Observable o, Object arg) {
		NationalBank bank = (NationalBank) o;
		this.eurPrice = bank.getEurPrice();
		this.usdPrice = bank.getUsdPrice();
		
		sendSMS();
	}
	
	public void sendSMS() {
		System.out.println("New EUR price is: " + eurPrice);
		System.out.println("New USD price is: " + usdPrice);
	}

}
