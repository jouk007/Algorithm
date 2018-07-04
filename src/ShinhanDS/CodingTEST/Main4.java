package ShinhanDS.CodingTEST;

import java.util.*;

public class Main4 {
	static int[][] A;
	static int[][] chk;
	static double min = 999999.0;
    public static void main(String[] args){
		int[] numbers = {0,1,2,3,7};
		int N = numbers.length;
		if(N<3){
			System.out.println("-1");
			System.exit(0);
		}

		Arrays.sort(numbers);
		for(int i=0; i<N-1; i++)
			if(numbers[i]==numbers[i+1]){
				System.out.println("-2");
				System.exit(0);
				
			}
				
		
		
		A = new int[10][10];
		int C[];
		int V;
		for(int k=0; k<N; k++)
			for(int m=0; m<N; m++){
				if( k == m)
					continue;
				A[numbers[k]][numbers[m]] = 1;
			}
		
		

		for(int i=0; i<N; i++){
			C = new int[10];
			if(numbers[i]==0)
				i+=1;
			V = i;
			B(A, C, V);
		}

		System.out.println((int)(min*10%10));
    }
	
	public static void B(int[][] A, int[] C, int V) {
		Queue<Integer> Q = new LinkedList<Integer>();
		C[V] = 1;
		Q.add(V);
		while(!Q.isEmpty()) {
			int n = Q.poll();
//			System.out.print(n+" ");
			for(int i = 0; i < A.length; i++) {
				if(C[i]!=1&&A[n][i]==1) {
					Q.add(i);
					C[i] = 1;
				}

				int sum = 0;
				int res = 0;
				for(int j=9; j>0; j--){
					
					sum += C[j];
					if(C[j]==1){
						res += j*Math.pow(10, sum-1);
					}
				}
				if(sum>=3){
					if(min > (double)res/7.0)
						min = (double)res/7.0;
					
				}
			}
		}
	}
}
/*
2018년 하반기 신입사원 공개채용 실무능력평가 for 박두리
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

신한DS에 입사한 황동수 선임은 부동산 관련 유지보수 업무를 맡게 되었습니다.
서울 면목동에 새로 분양하는 아파트에 미분양이 발생하였는데, 미분양 공고 이후 수명의 지원자를 모집하게 되었습니다. 
이 중 한 명을 당첨자로 선정해야 하는데, 미분양 공고에는 다음과 같은 추첨 조건이 주어졌습니다.

추첨조건
주어지는 3개 이상 10개 이하의 0~9의 정수 가운데, 중복되지 않는 3개의 수를 조합한다. 조합하여 나온 정수는 반드시 세자리 양의 정수여야 한다.

만약 3개 미만의 정수가 입력되면 -1을 리턴하고 정상 종료한다.
만약 중복된 정수가 입력되면 -2를 리턴하고 정상 종료한다.(예 : 2, 3, 3, 6 --> 3이 중복임, -2 리턴)
조합된 세자리 양의 정수는 7로 나누어서 실수를 구하고, 구한 실수 가운데 가장 작은 값의 소수점 아래 첫째 자리 숫자로 당첨자 번호를 선택한다.
(예1) 123.19873 --> 1
(예2) 21.0 --> 0 *당첨자 번호는 0이 나올 수 있다.

입출력 예
numbers(주어진 한자리 정수들)	Result
[0,1,2,3,4]	5
[1,2]	-1
[8,4,2,1,8]	-2
입출력 예 설명
예시 1
숫자 0, 1, 2, 3, 4 를 조합해 만들 수 있는 세자리 수로는 102, 103, 104, 201, ... 가 있습니다. ( 012와 같이 0으로 시작하는 수는 두자릿수이기에 제외합니다. )
이 중 7로 나눴을 때 구할 수 있는 가장 작은 실수는 17.571428571428573 입니다.
17.571428571428573의 소수점 아래 첫째자리 수는 5이므로 5를 리턴해야합니다.
예시 2, 3
생략합니다.

Solution.java

1
import java.util.*;
2
class Solution {
3
    static int[][] A;
4
    static double min = 999999.0;
5
    public int solution(int[] numbers) {
6
        int N = numbers.length;
7
        if(N<3){
8
            System.out.println("-1");
9
            System.exit(0);
10
        }
11
​
12
        Arrays.sort(numbers);
13
        for(int i=0; i<N-1; i++)
14
            if(numbers[i]==numbers[i+1]){
15
                System.out.println("-2");
16
                System.exit(0);
17
                
18
            }
19
                
20
        
21
        
22
        A = new int[10][10];
23
        int C[];
24
        int V;
25
        for(int k=0; k<N; k++)
26
            for(int m=0; m<N; m++){
실행 결과    
코드를 저장하였습니다.
종료까지
00:06:52
*/