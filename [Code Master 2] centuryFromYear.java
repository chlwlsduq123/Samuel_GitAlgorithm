/*
Given a year, return the century it is in. The first century spans
from the year 1 up to and including the year 100,
the second - from the year 101 up to and including the year 200, etc.

Example

For year = 1905, the output should be
centuryFromYear(year) = 20;
For year = 1700, the output should be
centuryFromYear(year) = 17.
--------------------------------------------------------------------------
*/

int centuryFromYear(int year) {
    int cent = 0;   // Century를 기억할 변수 cent 초기화
    int left = 0;   // 남는걸 저장할 변수 left
    cent = year / 100;
    left = year % 100;
    
    if(left != 0){
        cent++;    
    }
    
    return cent;
    
}