class stringzNewish {
	public static void main(String[] args) {
		System.out.println("Is abcde abecedarian? ");
		System.out.println(abecedarian("abcde"));
		System.out.println("Is higjehsi abecedarian? ");
		System.out.println(abecedarian("higjehsi"));
		System.out.println("Is higjehsi Dubledrome? ");
		System.out.println(isDubledrome("higjehsi"));
		System.out.println("Is llaammaa Dubledrome? ");
		System.out.println(isDubledrome("llaammaa"));
		System.out.print("'Captain Crunch' as encoded is: "); 
	    // run method and write result
	    String myResult = encode("Captain Crunch", 21);
	    System.out.println(myResult);  
	  //print out the word and check.
	    System.out.print("'"+myResult+"'" +" as decoded is: ");  
	 // run method and write result
	    System.out.println(encode(myResult, -21));  
	}
	public static boolean abecedarian(String s){
		boolean trying = true;
		for (int i=0; i < s.length()-1; i++) {
			int j=i;
			if (s.charAt(j) > s.charAt(j + 1)) {
				trying=false;
				i=s.length();
			}
		}
	return trying;
	}	
	public static boolean isDubledrome(String s){
			boolean trying = true;
			if (s.length()%2 != 0) {
				trying=false;
			}else {
		for (int i=0; i < s.length()-1; i += 2) {
			int j=i;
			if (s.charAt(j) != s.charAt(j + 1)) {
				trying=false;
				i=s.length();
			}		
		}	
	}
	return trying;
	}
	public static String encode(String s, int n) {
         String newString = "";
         //if (n==26||n==-26)n=0; doesn't work if greater than 26
         //remainder if divided by 26
         //works well if number is greater than 26
         n=n%25;
         int charz = 'z';
         int chara = 'a';
         int charZ = 'Z';
         int charA = 'A';
         char curChar = ' ';
         int loc;
         String alphaChar = "abcdefghijklmnopqrstuvwxyz";
         String alphaUChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         for(int i = 0;i < s.length();i++) {
                 curChar = s.charAt(i); 
                 if (chara <= curChar && curChar <= charz ) {
                	 loc = -1;
                	 loc = alphaChar.indexOf(curChar);
                     // curChar is lower case and within a to z
                	 // changes character to an integer value
                	 if (loc >= 0 && loc <= 25){
                		 loc = loc + n;
                		 if (loc > 25){
                			 loc = loc - 26;
                		 }
                		 else if (loc < 0){
                			 loc = 26 + loc;
                		 }
                		 newString = newString + alphaChar.charAt(loc);
                	 }
                         
                 } else if (charA <= curChar && curChar <= charZ ) {
                	 //Same type of work, but for capital letters
                	 loc = -1;
                	 loc = alphaUChar.indexOf(curChar);
                     // curChar is lower case and within a to z
                	 // changes character to an integer value
                	 if (loc >= 0 && loc <= 25){
                		 loc = loc + n;
                		 if (loc > 25){
                			 loc = loc - 26;
                		 }
                		 else if (loc < 0){
                			 loc = 26 + loc;
                		 }
                		 newString = newString + alphaUChar.charAt(loc);
                	 }
                 } else {
                	 // handles spaces and characters that aren't letters
                         newString = newString + (char)curChar;
                 }   
                 // index to next character in the string
         }
         return newString;
 }

}