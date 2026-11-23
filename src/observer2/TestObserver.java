package observer2;

public class TestObserver {

	public static void main(String[] args) {
		NationalBank bank = new NationalBank();
		ExchangeOffice exchangeOffice = new ExchangeOffice();
		
		bank.addObserver(exchangeOffice);
		
		bank.setEurPrice(117.55);
		bank.setUsdPrice(110);

	}

}
