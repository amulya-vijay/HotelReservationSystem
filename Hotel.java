package hotelReservation;

public class Hotel {

	
	private String name;
	private Rates rates;

	public Hotel (String hotelName, Rates rates) {
		
		this.setName(hotelName);
		this.setRates(rates);
				
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rates getRates() {
		return rates;
	}

	public void setRates(Rates rates) {
		this.rates = rates;
	}
	
	@Override
	public String toString() {
		return "Hotel Details: \nHotel Name:"+this.name+"\n"+this.rates;
	}

}
