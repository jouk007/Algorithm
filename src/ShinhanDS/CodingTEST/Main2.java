package ShinhanDS.CodingTEST;

import java.util.*;
public class Main2 {
	static int Result = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(7,34));
	}
    public static int solution(int iCtemp, int iTtemp) {
        if(iCtemp == iTtemp)
        	return 0;
        int TC = Math.abs(iTtemp-iCtemp);
        int CT = Math.abs(iCtemp-iTtemp); 
        if(TC<CT)
        {
        	if(iTtemp-iCtemp>=10){
        		return solution(iCtemp, iTtemp-10)+1;
        	}

        	if(iTtemp-iCtemp>=5){
        		return solution(iCtemp, iTtemp-5)+1;
        	}

        	if(iTtemp-iCtemp>=1){
        		return solution(iCtemp, iTtemp-1)+1;
        	}
        }
        else
        {
        	if(iCtemp-iTtemp>=10){
        		return solution(iCtemp-10, iTtemp)+1;
        	}

        	if(iCtemp-iTtemp>=5){
        		return solution(iCtemp-5, iTtemp)+1;
        	}

        	if(iCtemp-iTtemp>=1){
        		return solution(iCtemp-1, iTtemp)+1;
        	}     
        }
        return 0;
    }

}
/*2018년 하반기 신입사원 공개채용 실무능력평가 for 박두리
테스트 안내
문의하기(채팅)
도움말
컴파일 옵션
테스트 종료
알고리즘 1
알고리즘 2
알고리즘 3
알고리즘 4
알고리즘 5
문제 설명
본 문제는 solution 함수의 return 값으로 정/오답을 판정하는 문제입니다. solution 함수가 문제가 요구하는 값을 리턴하도록 코드를 작성하세요.

신한DS 김신한 선임은 근무 중 냉난방기 온도를 조절하려고 합니다.
냉난방기의 리모컨의 온도 조절 버튼은 6개가 있습니다.

1도	5도	10도
증가	증가	증가
감소	감소	감소
이 6개의 버튼으로 목표 온도를 조절해야 합니다.
현재 설정 온도와 변경하고자 하는 목표 온도가 주어지면 이 버튼들을 이용하여 목표 온도로 변경하고자 합니다.
이 때 최소한의 조작 횟수를 구하시오.

제한사항
현재 온도 iCtemp와 목표 온도 iTtemp가 인자로 주어집니다. (0 <= iCtemp, iTtemp <= 40)
입출력 예
iCtemp(현재온도)	iTtemp(목표온도)	Result
7	34	5
입출력 예 설명
현재온도 7도에서 목표온도 34도로 변경하는 경우,
총 5번(7 → 17 → 27 → 32 → 33 → 34) 누르면 됩니다.

Solution.java

1
import java.util.*;
2
// input 7, 11 인 경우, 7->12->11이 최적값이다. 시간이 남으면, 고쳐보도록 하자.
3
class Solution {
4
    static int Result = 0;
5
    public static int solution(int iCtemp, int iTtemp) {
6
        if(iCtemp == iTtemp)
7
            return 0;
8
        if(iCtemp < iTtemp){
9
            if(iTtemp-iCtemp>=10){
10
                return solution(iCtemp, iTtemp-10)+1;
11
            }
12
​
13
            if(iTtemp-iCtemp>=5){
14
                return solution(iCtemp, iTtemp-5)+1;
15
            }
16
​
17
            if(iTtemp-iCtemp>=1){
18
                return solution(iCtemp, iTtemp-1)+1;
19
            }
20
        }
21
        if(iCtemp > iTtemp){
22
            if(iCtemp-iTtemp>=10){
23
                return solution(iCtemp-10, iTtemp)+1;
24
            }
25
​
26
            if(iCtemp-iTtemp>=5){
27
                return solution(iCtemp-5, iTtemp)+1;
28
            }
29
​
30
            if(iCtemp-iTtemp>=1){
31
                return solution(iCtemp-1, iTtemp)+1;
32
            }           
33
        }
34
        return 0;
35
    }
36
}
실행 결과    
실행 결과가 여기에 표시됩니다.
종료까지
01:28:52
*/
