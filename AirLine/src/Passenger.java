import java.util.ArrayList;

public class Passenger extends User{
	
	private ArrayList<Booking> userBookings;

	public Passenger(int id, String name) {
		super(id, name, false, true);
		userBookings=new ArrayList<Booking>();
	}


	public void adduserBooking(Booking b) {
		this.userBookings.add(b);
		System.out.println("booking added to personal bookings");
	}
	
	
}
