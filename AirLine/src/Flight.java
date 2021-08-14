import java.util.Random;

public class Flight {
	private String id;
	private String src;
	private String dest;
	private int cost;
	
	// constructor
	public Flight(String id, String src, String dest) {
		this.id = id;
		this.src = src;
		this.dest = dest;
		Random rand=new Random();
		this.cost=rand.nextInt(1000);
	}
	
	public void showInfo() {
		System.out.println(this.id+" from " + src +" to " + dest + " Cost: "+cost);
	}
	
	
	// getters and setters
	public String getId() {
		return id;
	}
	
	public int getCost() {
		return this.cost;
	}
//	public void setId(String id) {
//		this.id = id;
//	}
	public String getSrc() {
		return src;
	}
//	public void setSrc(String src) {
//		this.src = src;
//	}
	public String getDest() {
		return dest;
	}
//	public void setDest(String dest) {
//		this.dest = dest;
//	}
	
	
}
