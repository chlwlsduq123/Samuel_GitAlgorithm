/*
Ticket numbers usually consist of an even number of digits. 
A ticket number is considered lucky if the sum of the first half of the digits is 
equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.
-------------------------------------------------------------------------------
*/

boolean isLucky(int n) {

        int result1 = 0;
		int result2 = 0;
		
		String s = String.valueOf(n);
		
		String s1 = s.substring(0, s.length()/2);
		String s2 = s.substring(s.length()/2);
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
        
        while(n1 != 0){
            result1 += (n1 % 10);
            n1 -= (n1 % 10);
            n1 /= 10;
        }
        
        while(n2 != 0){
            result2 += (n2 % 10);
            n2 -= (n2 % 10);
            n2 /= 10;
        }
        
        if(result1 == result2){
            return true;
        }else{
            return false;
        }

}
