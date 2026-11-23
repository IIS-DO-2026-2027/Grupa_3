package observer2;

import java.util.Observable;

public class NationalBank extends Observable{
	private double eurPrice;
	private double usdPrice;
	
	public double getEurPrice() {
		return eurPrice;
	}
	
	public void setEurPrice(double eurPrice) {
		this.eurPrice = eurPrice;
		setChanged();
		notifyObservers();
	}
	
	public double getUsdPrice() {
		return usdPrice;
	}
	
	public void setUsdPrice(double usdPrice) {
		this.usdPrice = usdPrice;
		setChanged();
		notifyObservers();
	}
	
	

}
