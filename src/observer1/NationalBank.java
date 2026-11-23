package observer1;

import java.util.ArrayList;
import java.util.Iterator;

public class NationalBank implements Observable {
	private double eurPrice;
	private double usdPrice;
	
	private ArrayList<Observer> observers = new ArrayList<Observer>(); 

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext())
			it.next().update(eurPrice, usdPrice);
	}

	public void setEurPrice(double eurPrice) {
		this.eurPrice = eurPrice;
		notifyObservers();
	}

	public void setUsdPrice(double usdPrice) {
		this.usdPrice = usdPrice;
		notifyObservers();
	}
	
	

}
