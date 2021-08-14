
public class User {
	private int id;
	private String name;
	private boolean isAdmin;
	private boolean isPassenger;
	
	
	public User(int id, String name, boolean isAdmin, boolean isPassenger) {
		this.id = id;
		this.name = name;
		this.isAdmin = isAdmin;
		this.isPassenger = isPassenger;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
}
