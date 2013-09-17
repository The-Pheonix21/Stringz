public class stringz {
	public static void main(String[] args) {
		String str = new String("A string"); 
		String s = "A string";



		// if (str.equals(s)) {
		// 	System.out.println("A");
		// }else {
		// 	System.out.println("B");
		// }
		// for (int i=0; i < str.length();i++) {
		// 	System.out.println(str.charAt(i));
		// // }
		// for (int i=0;i < str.length()-1;i++) {
		// 	System.out.println(str.substring(i, i+2));
		// }
		// if (contains("baseball", "ball")) {
		// 	System.out.println("Yes");
		// }else {
		// 	System.out.println("No");
		// }
		// count("people", "e");
		// }
		// public static int count(String s, String t){
		// 	int total = 0;
		// 	for (int i=0;i < s.length()-t.length()+1;i++) {
		// 		if (s.substring(i, i+t.length()).equals(t)) {
		// 			total++;
		// 		}
		// 	}
		// 	return total;	
		// }
		// if (abecedarian("abdest")) {
		//  	System.out.println("Yes");
		//  }
	// 	if (abecedarian("Hello")) {
	// 		System.out.println("No");
	// 	}
	System.out.println(abecedarian("abcde"));
	System.out.println(abecedarian("ghyei"));
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
// public static boolean hasAnA(String s){
	// 	for (int i=0; i<s.lenght();i++) {
	// 	if (s.charAt(i)== 'a' ||s.charAt(i)== 'A' ) {
	// 		return true;	
	// 		}else {
	// 		return false;
	// 		}	
	// 	}
	// }
	// public static int pallendrome(String s) {
	// 	String reverse = new String();
	// 	for (int i= s.length()-1; ; ) {	
	// 	}
	// } 
	// public static boolean contains(String s, String t){
	// 	for (int i=0;i < s.length()-t.length()+1;i++) {
	// 		if (s.substring(i, i+t.length()).equals(t)) {
	// 			return true;	
	// 		}
	// 	}
	// 		return false;	
	// }
}