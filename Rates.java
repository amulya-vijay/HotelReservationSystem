package hotelReservation;

public class Rates {

	//types of rates
	int weekendRates;
	int weekdayRates;
	
	//constructor to initialize the values
	public Rates(int weekdayRates, int weekendRates) {
		this.weekdayRates = weekdayRates;
		this.weekendRates = weekendRates;
	}
	
	@Override
	public String toString() {
		return "Rates: \nWeekday Rates:"+this.weekdayRates+"\nWeekend Rates:"+this.weekendRates;
	}

}
