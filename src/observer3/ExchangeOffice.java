package observer3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

//observer = listener
public class ExchangeOffice implements PropertyChangeListener {
	private double eurPrice;
	private double usdPrice;
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals("eur"))
			this.eurPrice = (double)evt.getNewValue();
		else if(evt.getPropertyName().equals("usd"))
			this.usdPrice = (double)evt.getNewValue();
		
		sendSMS();

	}
	
	public void sendSMS() {
		System.out.println("New EUR price is: " + eurPrice);
		System.out.println("New USD price is: " + usdPrice);
	}

}
