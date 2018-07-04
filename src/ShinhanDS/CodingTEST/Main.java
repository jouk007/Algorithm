package ShinhanDS.CodingTEST;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sBuffer = sc.next();
        if(sBuffer.length()<9){
        	System.out.print("-1");
        	System.exit(0);
        }
        int[] row = new int[3];
        int[] col = new int[3];
        int sum =0;
        for(int i=0; i<9; i++){
        	if(i<=2){
				System.out.print(sBuffer.charAt(i)-'0'+",");
        		row[0] += sBuffer.charAt(i)-'0';
        		if(i==2){
            		System.out.print(row[0]+",");
        		}
        		}
        	else if(i<=5){
        		System.out.print(sBuffer.charAt(i)-'0'+",");
        		row[1] += sBuffer.charAt(i)-'0';
        		if(i==5){
            		System.out.print(row[1]+",");
        		}
        	}
        	else if(i<=8){
        		System.out.print(sBuffer.charAt(i)-'0'+",");
        		row[2] += sBuffer.charAt(i)-'0';
        		if(i==8){
            		System.out.print(row[2]+",");
        		}
        	}
        }
        for(int i=0; i<9; i++){
        	if(i%3==0)
        		col[0] += sBuffer.charAt(i)-'0';
        	else if(i%3==1)
        		col[1] += sBuffer.charAt(i)-'0';
        	else if(i%3==2)
        		col[2] += sBuffer.charAt(i)-'0';
        }
        for(int i=0; i<3; i++){
        	sum += col[i];
        	System.out.print(col[i]+",");
        }
        System.out.println(sum);
        
        
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
본 문제는 표준입출력을 이용하는 문제입니다. 표준 입력(scanf 또는 input 함수)을 사용해 값을 입력받고, 표준 출력(print 함수)를 이용해 정답을 출력하세요.

신한DS 김신한 선임은 엑셀 사용 시 숫자 합계를 구하기 위해 SUM() 함수를 많이 사용합니다. 한자리 숫자 9개가 입력으로 주어졌을때, 각 자릿수로 다음과 같은 엑셀 그리드를 출력하는 프로그램을 만들어주세요.

1열	2열	3열	
1행	1번째수	2번째수	3번째수	1행의 합
2행	4번째수	5번째수	6번째수	2행의 합
3행	7번째수	8번째수	9번째수	3행의 합
1열의 합	2열의 합	3열의 합	모든 자릿수의 합
제한사항
Input 으로 숫자 9개가 주어지지 않을 경우, -1을 출력해야합니다.
입출력 예
Input	Result
123456789	1,2,3,6,4,5,6,15,7,8,9,24,12,15,18,45
0333	-1
입출력 예 설명
Input : 0~9의 자연수가 9개 입력됩니다.
Result : 4 X 4 2차원 배열을 순서대로 출력합니다.

1	2	3	합계=6
4	5	6	합계=15
7	8	9	합계=24
합계=12	합계=15	합계=18	총계=45
Solution.java

1
import java.util.Scanner;
2
​
3
public class Solution {
4
    public static void main(String[] args) {
5
        Scanner sc = new Scanner(System.in);
6
        String sBuffer = sc.next();
7
        if(sBuffer.length()<9){
8
            System.out.print("-1");
9
            System.exit(0);
10
        }
11
        int[] row = new int[3];
12
        int[] col = new int[3];
13
        int sum =0;
14
        for(int i=0; i<9; i++){
15
            if(i<=2){
16
                System.out.print(sBuffer.charAt(i)-'0'+",");
17
                row[0] += sBuffer.charAt(i)-'0';
18
                if(i==2){
19
                    System.out.print(row[0]+",");
20
                }
21
                }
22
            else if(i<=5){
23
                System.out.print(sBuffer.charAt(i)-'0'+",");
24
                row[1] += sBuffer.charAt(i)-'0';
25
                if(i==5){
26
                    System.out.print(row[1]+",");
27
                }
28
            }
29
            else if(i<=8){
30
                System.out.print(sBuffer.charAt(i)-'0'+",");
31
                row[2] += sBuffer.charAt(i)-'0';
32
                if(i==8){
33
                    System.out.print(row[2]+",");
34
                }
35
            }
36
        }
37
        for(int i=0; i<9; i++){
38
            if(i%3==0)
39
                col[0] += sBuffer.charAt(i)-'0';
40
            else if(i%3==1)
41
                col[1] += sBuffer.charAt(i)-'0';
42
            else if(i%3==2)
43
                col[2] += sBuffer.charAt(i)-'0';
44
        }
45
        for(int i=0; i<3; i++){
46
            sum += col[i];
47
            System.out.print(col[i]+",");
48
        }
49
        System.out.println(sum);
50
    }
51
}
실행 결과    
실행 결과가 여기에 표시됩니다.
종료까지
01:40:08
*/