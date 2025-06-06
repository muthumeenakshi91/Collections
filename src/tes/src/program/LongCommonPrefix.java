package tes.src.program;

public class LongCommonPrefix {
	public static void main(String args[]) {
		String[] strs = {"flower","flow","flight"};
		        int n = strs[0].length();
		        String prefix= strs[0].substring(0, n);//flow
		        boolean isLargePrefix = true;
		        
		        for(int i = 1; i<strs.length;i++){//3
		        	System.out.println(i+" element "+strs[i]);
		            
		            System.out.println("prefix "+prefix);
		            while(n > strs[i].length() || !strs[i].startsWith(prefix)){
		            	System.out.println("inside while "+strs[i]);
		                        n = n - 1;
		                        if(n ==0)
		                        System.out.println("inside while empty string");
		                        
		                        prefix = strs[0].substring(0, n);//flo
		                        //break;
		                
		            }
		        }
		        if(isLargePrefix)
		            System.out.println("inside isLargePrefix "+prefix);
		        else
		        	System.out.println("inside empty string");
		
		        /*String pref = strs[0];
		        int prefLen = pref.length();
				
				for (int i = 1; i < strs.length; i++) {
		            String s = strs[i];
		            while (prefLen > s.length() || !pref.equals(s.substring(0, prefLen))) {
		                prefLen--;
		                if (prefLen == 0) {
		                    System.out.println("inside if ");
		                }
		                pref = pref.substring(0, prefLen);
		            }
		        }

				System.out.println("outside if "+pref);*/
		
	}
}
