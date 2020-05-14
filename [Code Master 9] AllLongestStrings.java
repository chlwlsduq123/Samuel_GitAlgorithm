/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
--------------------------------------------------------------
*/


String[] allLongestStrings(String[] inputArray) {
    
    int num = 0;
    int cnt = 0;
    int idx = 0;
	

    for(int i = 0; i < inputArray.length; i++){     // 제일 긴 문자열의 갯수는 몇인가?
        if(num < inputArray[i].length()){
            num = inputArray[i].length();
        }
    }
	
    for(int i = 0; i < inputArray.length; i++){     // 제일 긴 문자열은 몇개인가?
        if(num == inputArray[i].length()){
            cnt++;
        }
    }

    String inputArray1[] = new String[cnt];     // 배열을 길이로

    for(int i = 0; i < inputArray.length; i++){     // 대입
        if(num == inputArray[i].length()){
            inputArray1[idx] = inputArray[i];
            idx++;
        }
    }

    return inputArray1;
}