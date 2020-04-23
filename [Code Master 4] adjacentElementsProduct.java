/*
Given an array of integers, find the pair of adjacent elements 
that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.
--------------------------------------------------------------------------
*/

int adjacentElementsProduct(int[] inputArray) {
    int num1 = 0;
    int num2 = 0;
    int fnal1 = 0;
    int fnal2 = 0;
    
    for(int i = 1; i < inputArray.length; i++){
	    	num1 = inputArray[i-1];
	    	num2 = inputArray[i];
	    	fnal1 = num1 * num2;
        
	    	if(i == 1) {
	    		fnal2 = fnal1;
	    	}
	    	if(fnal2 < fnal1){
	    	    fnal2 = fnal1;
	    	}
	    }
    
    return fnal2;
    
    
}