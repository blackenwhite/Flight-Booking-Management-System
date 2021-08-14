
public class Main {
	public static void main(String[] args) {
		AirlineSystem dhoka=new AirlineSystem("Dhoka");
		//dhoka.generate_flights();
		dhoka.showAvailableFlights();
		Passenger p=new Passenger("PM","Parag Mundha");
		dhoka.addPassenger(p);
		dhoka.addBooking(p, 4);
	}
}
