package inhertianceSample;

public class InhertianceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1=new Person();
		person1.setFirstName("Sivakumar");
		person1.setLastName("Parthiban");
		
		
		Father person2=new Father();
		person2.setFirstName("SivaKumar");
		person2.setLastName("Parthiban");
		person2.setSpouseName("Brinda");
		person2.setNumberOfKids(2);
		
		Employee person3=new Employee();
		person3.setEmployeeCompanyName("RamondJames");
		person3.setEmployeeId(1234);
		
		Son person4=new Son();
		person4.setFatherName("Parthiban");
		person4.setMotherName("padimani");
		
		System.out.println(person1.getFirstName());
		System.out.println(person1.getLastName());
		
		
		System.out.println(person2.getFirstName());
		System.out.println(person2.getLastName());
		System.out.println(person2.getSpouseName());
		System.out.println(person2.getNumberOfKids());
		
		System.out.println(person3.getEmployeeCompanyName());
		System.out.println(person3.getEmployeeId());
		
		System.out.println(person4.getFatherName());
		System.out.println(person4.getMotherName());
		
		
		
		
	
		
	}

}
