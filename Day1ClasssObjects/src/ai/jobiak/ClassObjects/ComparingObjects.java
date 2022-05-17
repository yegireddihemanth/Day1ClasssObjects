package ai.jobiak.ClassObjects;

public class ComparingObjects {
	public static void main(String args[]) {
		
		Contact2 contact =  new Contact2();
		Contact2 contact2 = new  Contact2();
		
		boolean result = contact==contact2;
		System.out.println(result);
		
		/*Contact2 contact3 =  new Contact2(); //why false here contact3 and contact4 refering to
											//unique memory locations so they have different hascodes
		Contact contact4 = new  Contact();
		boolean result2 = contact3==contact4;
		System.out.println(result2);*/
		
		boolean result3 = (contact.hashCode()==contact2.hashCode());
		System.out.println(result3);
		
		
		
		
		
	}
	

}
