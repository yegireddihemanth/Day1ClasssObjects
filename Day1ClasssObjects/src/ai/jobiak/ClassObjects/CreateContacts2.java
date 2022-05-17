package ai.jobiak.ClassObjects;

public class CreateContacts2 {

	public static void main(String[] args) {
		
	// creating class class objects
		//we are trying to intentiate the contact class
		Contact2 con1 = new Contact2(); // it is a constructor
		// Contact() is a object
		// now memory is allocated on heap
		// now it have all the copy of data members
		// and that reference is returned into con1
		
		System.out.println(con1.getContactId());
		System.out.println(con1.getCompany());
		System.out.println(con1.getMobileNo());
		System.out.println(con1.getCompany());
		System.out.println(con1.getEmail());
		
		con1.setContactId(111);
		con1.setCompany("jobiak");
		con1.setEmail("hemanthkumar.yegireddy@jobiak.com");
		con1.setFirstName("hemanthkumar");
		con1.setMobileNo(7993306633L);
		// here mobile number is a string literal and it is crossing 
		//it's limits so we changed into long
		// we done to initilize the data members.
		
		System.out.println(con1.getContactId());
		System.out.println(con1.getCompany());
		System.out.println(con1.getMobileNo());
		System.out.println(con1.getCompany());
		System.out.println(con1.getEmail());
		
		con1.setContactId(222);
		System.out.println(con1.getContactId());
		
		

	}

}
