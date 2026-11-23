package observer3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NationalBank {
	private double eurPrice;
	private double usdPrice;
	
	//observable = support
	private PropertyChangeSupport support;
	
	public NationalBank() {
		support = new PropertyChangeSupport(this);
	}
	
	public void addLister(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}
	
	public void removeListener(PropertyChangeListener listener) {
		support.removePropertyChangeListener(listener);
	}

	public void setEurPrice(double eurPrice) {
		support.firePropertyChange("eur", this.eurPrice, eurPrice);
		this.eurPrice = eurPrice;
	}

	public void setUsdPrice(double usdPrice) {
		support.firePropertyChange("usd", this.usdPrice, usdPrice);
		this.usdPrice = usdPrice;
	}
	
	

}
