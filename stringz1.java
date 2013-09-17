public class stringz {
	public static void main(String[] args) {
		String str = new String("A string"); 
		String s = "A string";
		System.out.println("Does 'cephlapod' have an 'A'? " + hasAnA("cephlapod"));
		System.out.println("Pallendromes are spelled the same front and back.");
		System.out.println("Are these?");
		System.out.println("'Cephlapod'? "+ pallendrome("cephlapod"));
		System.out.println("'civic'? " + pallendrome("civic"));
		System.out.println();
		 if (str.equals(s)) {
		 	System.out.println(str + " equals " + s);
		 }else {
		 	System.out.println(str + " does not equal " + s);
	 }
		 System.out.println();
		 System.out.println("printing each character of " + str + " with for statement.");
		 for (int i=0; i < str.length();i++) {
		 	System.out.print(str.charAt(i) + " ");
		  }
		 System.out.println();
		 System.out.println("Printing 2 digit substring of "+ str);
		 for (int i=0;i < str.length()-1;i++) {
		 	System.out.println(str.substring(i, i+2));
		 }
		 System.out.println();
		 System.out.println("Checking for substring in string.");
		 System.out.println("Does 'baseball' contain 'ball'?");
		 if (contains("baseball", "ball")) {
		 	System.out.println("Yes");
		 }else {
		 	System.out.println("No");
		 }
		 System.out.println();
		 System.out.println("Count how many 'e's are in 'people'.");
		 int c = mytotal("people","e");
		 System.out.println(c);	
		 System.out.println();
	System.out.println("Is 'abcde' an abecedarian? " + abecedarian("abcde"));
	System.out.println("is 'hello' an abecedarian? " + abecedarian("hello"));
	}
	public static int mytotal(String s, String t){
	 int total = 0;
	 int b = -1;
	 	for (int i=0;i < s.length();i++) {
	 		b=(s.indexOf (t, i));
	 		if (b >= 0) {
				total++;
				i = b+t.length();
			}
	 	}
	return total;	
	 }
	public static boolean abecedarian(String s){
		for (int i=0; i < s.length()-1;i++) {
			int j=i;
			if (s.charAt(j) > s.charAt(j + 1)) {
				return false;
			}
		}
		return true;
	}	
 public static boolean hasAnA(String s){
	 	for (int i=0; i < s.length(); i++) {
	 	if (s.charAt(i)== 'a' ||s.charAt(i)== 'A' ) {
 		return true;	
 		}
	}
	 	return false;
 }

	 public static String pallendrome(String s) {
	 	String reverse = new String();
	    int len = s.length();
			for (int i = len-1; i >= 0; i--){
			reverse += s.charAt(i);
			 }
		 return reverse;
		}	

	 public static boolean contains(String s, String t){
	 		int b = (s.indexOf(t));
	    if (b > 0) {
	    	//match found
	    	return true;
	    }
	 		return false;	
	 }
}