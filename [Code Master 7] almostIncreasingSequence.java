/*
Given a sequence of integers as an array,
determine whether it is possible to obtain a strictly increasing sequence
by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing
if a0 < a1 < ... < an. Sequence containing only one element is also considered
to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
almostIncreasingSequence(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly
increasing sequence.

For sequence = [1, 3, 2], the output should be
almostIncreasingSequence(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. 
Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

--------------------------------------------------------------------------------------------
*/

boolean almostIncreasingSequence(int[] sequence) {

    boolean big = true;
    boolean cnt = false;

    for(int i = 0; i < sequence.length-1; i++){
        if(sequence[i] >= sequence[i+1] && cnt == false){   // 현재 숫자 >= 다음 숫자
            if(sequence[i+1] == sequence[sequence.length-1]){   // 다음 숫자 == 마지막 숫자 
                sequence[i+1] = sequence[i];    // 다음 숫자 없애기.
            }else{  // 다음 숫자 == 마지막 숫자 X
                if(sequence[i] < sequence[i+2]){    // 현재 숫자 < 다다음 숫자 
                    sequence[i+1] = sequence[i+2];  // 다음 숫자 = 다다음숫자    
                }else{  // 현재 숫자 > 다다음숫자
                    sequence[i] = sequence[i+1];    // 현재숫자 = 다음숫자
                }
                cnt = true;
            }
        }else if(cnt == true){
            sequence[i] = sequence[i+1];
        }
    }

    for(int i = 0; i < sequence.length-2; i++){
        if(sequence[i] >= sequence[i+1]){               // 현재 숫자 >= 다음 숫자
            big = false;
        }
    }

    return big;
}


