package ShinhanDS.CodingTEST;

//숫자는 +3, 10의 자리는 버린다.
//특수문자는 그대로.
//소문자는 +10
//대문자는 +5
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String source = sc.next();
        int N = source.length();
        for(int i=0; i<N; i++){
        	char c = source.charAt(i);
        	if('0'<=c && c<='9'){
        		System.out.print(((c+3-'0')%10));
        	}
        	else if('a'<=c && c<='z'){
        		System.out.print((char)((c+10-'a')%26+'a'));
        		
        	}
        	else if('A'<=c && c<='Z'){
        		System.out.print((char)((c+5-'A')%26+'A'));
        		
        	}
        	else{
        		System.out.print(c);
        		
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
본 문제는 표준입출력을 이용하는 문제입니다. 표준 입력(scanf 또는 input 함수)을 사용해 값을 입력받고, 표준 출력(print 함수)를 이용해 정답을 출력하세요.

마동석 선임은 정보유출 방지를 이용하여 자리를 비울 경우 PC 화면보호기를
적극 이용하고 있습니다.
그러나, 마동석 선임은 매번 비밀번호를 잊어버려 메모지에 적고 싶으나
타인이 바로 읽어 알 수 있으므로,
간단한 시저 암호(Caesar cipher)를 이용하여 적기로 하고 코드를 작성합니다.
마동석 선임이 되어 코드를 작성해 보세요.

단어 하나를 입력받아 시저 암호의 단어를 출력하는 코드를 작성하십시오.
예시를 보고 시저 암호 체계를 유추하여 작성하면 됩니다.

제한사항
1) 입력문자에서 한글은 제외합니다.(영문소문자, 영문대문자, 특수문자, 숫자만 처리)
2) 입력문자는 1단어로 제한합니다.
3) 입력문자는 100 바이트로 제한합니다.

입출력 예
Input	Output
Wellcome!	Bovvmywo!
2018WorldCup	5341BybvnHez
name88@shinhan.com	xkwo11@crsxrkx.myw
Solution.java

import java.util.Scanner;
// 숫자는 +3, 10의 자리는 버린다.
// 특수문자는 그대로.
// 소문자는 +10
// 대문자는 +5
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String source = sc.next();
        int N = source.length();
        for(int i=0; i<N; i++){
        	char c = source.charAt(i);
        	if('0'<=c && c<='9'){
        		System.out.print(((c+3-'0')%10));
        	}
        	else if('a'<=c && c<='z'){
        		System.out.print((char)((c+10-'a')%26+'a'));
        		
        	}
        	else if('A'<=c && c<='Z'){
        		System.out.print((char)((c+5-'A')%26+'A'));
        		
        	}
        	else{
        		System.out.print(c);
        		
        	}
        } 
    }
}
1
import java.util.Scanner;
2
// 숫자는 +3, 10의 자리는 버린다.
3
// 특수문자는 그대로.
4
// 소문자는 +10
5
// 대문자는 +5
6
public class Solution {
7
    public static void main(String[] args) {
8
        Scanner sc = new Scanner(System.in);
9
        String source = sc.next();
10
        int N = source.length();
11
        for(int i=0; i<N; i++){
12
            char c = source.charAt(i);
13
            if('0'<=c && c<='9'){
14
                System.out.print(((c+3-'0')%10));
15
            }
16
            else if('a'<=c && c<='z'){
17
                System.out.print((char)((c+10-'a')%26+'a'));
18
                
19
            }
20
            else if('A'<=c && c<='Z'){
21
                System.out.print((char)((c+5-'A')%26+'A'));
22
                
23
            }
24
            else{
25
                System.out.print(c);
26
                
27
            }
28
        } 
29
    }
30
}
실행 결과    
실행 결과가 여기에 표시됩니다.
종료까지
00:58:28
*/