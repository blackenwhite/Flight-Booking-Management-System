import java.util.ArrayList;

public class AirlineSystem {
	private String name;
	private ArrayList<Flight> flights;
	private ArrayList<Administrator> admins;
	private ArrayList<Passenger> passengers;
	
	private ArrayList<Booking> bookings;
	
	public AirlineSystem(String name) {
		this.name=name;
		flights=new ArrayList<Flight>();
		admins=new ArrayList<Administrator>();
		passengers=new ArrayList<Passenger>();
		bookings=new ArrayList<Booking>();
		Welcome();
		generate_flights();
	}
	
	private void Welcome() {
		System.out.println(" Welcome to Airline "+this.name);
	}
	
	// generate flights from every city to every other city
	// currently there are 10 cities in India named 1 to 10
	private void generate_flights() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j) continue; // avoid flights from same city to same city
				String p="AI";
				p+=i;
				
				p+=j;
				// testing statement
				//System.out.println(p); // Running correctly
				Flight temp=new Flight(p,String.valueOf(i),String.valueOf(j));
				flights.add(temp);
			}
		}
	}
	
	// checks if an Admin is already present
	private boolean searchAdmin(Administrator e) {
		
		for(int i=0;i<admins.size();i++) {
			if(e.getId()==admins.get(i).getId()) {
				System.out.println("Admin already present");
				return true;
			}
		}
		return false;
	}
	
	// checks if Passenger is already present
	private boolean searchPassenger(Passenger e) {
		for(int i=0;i<passengers.size();i++) {
			if(e.getId()==passengers.get(i).getId()) {
				System.out.println("Passenger already present");
				return true;
			}
		}
		return false;
	}
	
	// function to add an administrator
	public void addAdmin(Administrator e) {
		boolean exists=searchAdmin(e);
		if(exists) {
			return;
		}
		admins.add(e);
	}
	
	// function to add a Passenger
	public void addPassenger(Passenger e) {
		boolean exists=searchPassenger(e);
		if(exists) return;
		
		passengers.add(e);
		System.out.println(e.getName()+" is added to passengers list");
		
	}
	
	//function to show all available flights
	public void showAvailableFlights() {
		System.out.println("---Available flights----");
		for(int i=0;i<flights.size();i++) {
			Flight temp=flights.get(i);
			System.out.print((i+1)+". ");
			temp.showInfo();
		}
	}
	
	public boolean addBooking(Passenger p,int flightId) {
		if(!p.isPassenger) {
			System.out.println("Not a passenger. Booking cancelled");
			return false;
		}
		Flight fl=flights.get(flightId);
		Booking temp=new Booking(fl.getSrc(),fl.getDest(),p.getName(),p.getId(),fl.getCost());
		bookings.add(temp);
		p.addhisBooking(temp);
		return true;
		
	}
	
}
