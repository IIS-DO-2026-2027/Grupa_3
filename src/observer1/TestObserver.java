package observer1;

public class TestObserver {

	public static void main(String[] args) {
		NationalBank bank = new NationalBank();
		ExchangeOffice exchangeOffice = new ExchangeOffice();
		
		bank.addObserver(exchangeOffice);
		
		bank.setEurPrice(117.5);
		bank.setUsdPrice(101);

	}

}
