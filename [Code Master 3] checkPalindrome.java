/*
Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.
----------------------------------------------------------------------
*/

boolean checkPalindrome(String inputString) {
    String[] arrA;  // 배열 선언
	arrA = inputString.split("");   // 스플릿을 사용하여 inpuString값을 하나하나 담는다
    
    String check = "";
    
    for(int i = arrA.length-1; 0 <= i; i--){
        check += arrA[i];
    }
    
    boolean flag = check.equals(inputString);
    
    return flag;
    
}