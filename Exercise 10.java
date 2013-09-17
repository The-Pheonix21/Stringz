public class Exercise10 {
	 public static void main(String[] args) {  
	        System.out.print("'Acknow' is an abecedarian?: ");  
	        System.out.println(isAbecedarian("acknow"));  
	  
	        System.out.print("'Significant' is an abecedarian?: ");  
	        System.out.println(isAbecedarian("significant"));  
	  
	        System.out.print("'Abcdefgh' is an abcedarian?: ");  
	        System.out.println(isAbecedarian("abcdefgh"));  
	  
	        System.out.print("'Octagenarian' is an abcedarian?: ");  
	        System.out.println(isAbecedarian("Octagenarian"));     
	 
	        System.out.print("'abckefg' is an abcedarian?: ");
	        System.out.println(isAbecedarian("abckefg"));
	 }  
	  
	    public static boolean isAbecedarian(String s) {  
	        Boolean result = true;
	        int len = s.length();  
	        int i = 0;  
	        while (i < (len - 1)) {  
	        	//need len-1 so that i+1 won't go out of bounds
	            if(s.charAt(i) > s.charAt(i + 1)) {  
	                result=false; 
	                //end the loop by setting i to a value greater than len -1
	                i = len;
	            } else { 
	            	//loop to next character to keep checking
	                i++;  
	            }  
	        }  
	        return result;  
	    }  
	  
	}  