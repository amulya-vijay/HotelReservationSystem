package hotelReservation;



import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class HotelReservationTest {
	//parameters declaration
	String name;
	int weekdayRates;
	int weekendRates;
	
	//constructor to initialize the parameters
	public HotelReservationTest(String name,int weekdayRates, int weekendRates) {
	
		this.name=name;
		this.weekdayRates = weekdayRates;
		this.weekendRates = weekendRates;
	}
	
	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
public static Collection imputValues() {
		// test case parameters 
		return  Arrays.asList(new Object[][] {{"Lakewood",110,90},{98,"io",0}});
	}

	HotelReservation hr = new HotelReservation();
	
	@Test
	public void addHoteltest() {
		//Test case to check if the hotel details are added
		Assert.assertEquals(name,hr.addHotel(name,weekdayRates,weekendRates));
		
		
	}

}
