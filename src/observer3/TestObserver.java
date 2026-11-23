package observer3;

public class TestObserver {

	public static void main(String[] args) {
		NationalBank bank = new NationalBank();
		ExchangeOffice exchangeOffice = new ExchangeOffice();
		
		bank.addLister(exchangeOffice);
		
		bank.setEurPrice(117.4);
		bank.setUsdPrice(105);

	}

}
