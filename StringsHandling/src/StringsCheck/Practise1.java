package StringsCheck;

public class Practise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "payment $100 paid";
		System.out.println(str.charAt(8));   // the location number needs to be passed to pull out the $ sign.
		String str1 = "payments $100 paid";
		System.out.println(str1.indexOf("$"));
		System.out.println(str1.substring(8));
		System.out.println("testing git hub 1");
		
		System.out.println("testing git hub 2");
		System.out.println("testing git hub 3");
		
		System.out.println("Hello this is American guy testing 1");
		System.out.println("Hello this is Guatemalan guy testing 2");
	}

}
