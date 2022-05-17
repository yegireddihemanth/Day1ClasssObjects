package ai.jobiak.ClassObjects;

public class CreateContacts {

	public static void main(String[] args) {
		
	// creating class class objects
		//we are trying to intentiate the contact class
		Contact con1 = new Contact(); // it is a constructor
		// Contact() is a object
		// now memory is allocated on heap
		// now it have all the copy of data members
		// and that reference is returned into con1
		
		System.out.println(con1.contactId);
		System.out.println(con1.company);
		System.out.println(con1.mobileNo);
		System.out.println(con1.company);
		System.out.println(con1.email);
		
		con1.contactId = 111;
		con1.company = "jobiak";
		con1.email="hemanthkumar.yegireddy@jobiak.com";
		con1.firstName= "hemanthkumar";
		con1.mobileNo= 7993306633L;
		// here mobile number is a string literal and it is crossing 
		//it's limits so we changed into long
		// we done to initilize the data members.
		
		System.out.println(con1.contactId);
		System.out.println(con1.company);
		System.out.println(con1.mobileNo);
		System.out.println(con1.company);
		System.out.println(con1.email);
		
		
		

	}

}
