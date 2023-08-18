package inhertianceSample;

public class Son extends Person{
	private String fatherName;
	private String motherName;
	
	public String getFatherName() {
		return fatherName;
	}
	
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	public String getMotherName() {
		return motherName;
	}
	
	public Son() {
		super();
	}

	public Son(String fatherName, String motherName) {
		super();
		this.fatherName = fatherName;
		this.motherName = motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	
	

}
