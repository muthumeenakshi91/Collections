package tes.src.program;

public class isPalindromeInt {
	static boolean isPalindrome(int x) {
        
	   	/*int num=x;
        int revnum = 0;
        int rem = 0;
        while(num>0){
        rem = num%10;
        revnum = revnum*10 + rem;
        num=num/10;
        
        }
        
        System.out.println(revnum);

        return revnum==x;*/
		
		String s = String.valueOf(x); // Convert to String
        int n = s.length(); // Store the String length to int n

        for (int i=0; i<n/2; i++) {
            // We check whether the elements at the same distance from
            // beginning and from ending are same, if not we return false
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }

        // if no flaws are found we return true
        return true;
   }

	public static void main(String[] args) {
		
	System.out.println( isPalindrome(121));
	
	
	}
}
