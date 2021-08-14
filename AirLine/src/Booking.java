
public class Booking {
	private String src;
	private String dest;
	private String customer_name;
	private String customer_id;
	private int cost;
	
	// date and time of flight to be added
	public Booking(String src, String dest, String customer_name, String customer_id, int cost) {
		this.src = src;
		this.dest = dest;
		this.customer_name = customer_name;
		this.customer_id = customer_id;
		this.cost = cost;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
}
