package inhertianceSample;

public class Father extends Person{

	private String spouseName;
	
	private int numberOfKids;

	public Father() {
		super();
	}

	public Father(String spouseName, int numberOfKids) {
		super();
		this.spouseName = spouseName;
		this.numberOfKids = numberOfKids;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public int getNumberOfKids() {
		return numberOfKids;
	}

	public void setNumberOfKids(int numberOfKids) {
		this.numberOfKids = numberOfKids;
	}
}
