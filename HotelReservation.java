package hotelReservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class HotelReservation {
	
	String name;
	int weekendRates;
	int weekdayRates;
	
	//Hash map is created to store hotel name and its corresponding rates
	Map<Hotel,Rates> hotelsReservationList = new HashMap<Hotel,Rates>();
	
	//Method to add the details of a hotel
	public String addHotel(String name, int weekdayRates,int weekendRates) {
		Rates rate = new Rates(weekdayRates,weekendRates); // object of Rates class 
		Hotel hotel = new Hotel(name,rate); //object of Hotel class
		try {
			hotelsReservationList.put(hotel,rate);
		}catch(Exception e) {
			System.out.println(e);
		}
		return name;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Hotel Reservation Program");
		
	}
	
	
}
