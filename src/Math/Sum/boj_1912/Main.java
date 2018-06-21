package Math.Sum.boj_1912;
/*
 * ----------------------------------------------
 * 연속합
 * 수열로 이루어진 배열 A={10, -4, 3, 1, 5, 6, -35, 12, 21, -1}가 있을 때,
 * 연속된 구간의 합 중, 가장 큰 합을 구하라.
 * ----------------------------------------------
 * 어떤 경우가 있을 지 생각해보자
 * 1. 모두 음수인 경우
 * 	가장 큰 값 하나를 추출하면 된다.
 * 2. 모두 양수인 경우
 *  전체를 다 더하면 된다.
 * 3. 둘 다 있는 경우
 *  ㄱ. 음수를 양 옆에 두고 합을 구한다. >> 10, -4, 3, 1, 5, 6 이면 다 더한게 더 큰데?
 *  ㄴ. 동적프로그래밍 기법을 이용하여, 이전 구간의 합을 사용해, 다음 구간의 합을 구해보자.
 * ----------------------------------------------
 * 10만개의 N, 최대 값은 1000 이므로 최대 구간합은 int로 처리 가능하다.
 * 구간 합 S는 몇 개가 필요할까? >> N=1,S=1/2,3/3,6/4,10
 * N, S는 N+N-1+N-2+...3+2+1개 즉, N(N+1)/2 개가 필요하다.
 * 더 자세히 보자면, 구간 길이 1일 때, N개, 길이 2일때, N-1개 .. 등등 이다.
 * 그런데, 10만개*10만개/2 개의 S가 필요한데.. 가능 할까??
 * 그러면 100억 개가 나오는데? 일단 배열에 담는건 아닌 것으로 판단.
 * ----------------------------------------------
 * 검색해서 아이디어를 좀 얻었다...
 * 처음부터 계속해서 수를 더해 나가는데,이 과정에서 음수라면, 버리고 0으로 새로 시작한다.
 * A={10, -4, 3, 1, 5, 6, -35, 12, 21, -1}을 예로 들어
 * Max를 구하는 과정을 살펴보면, 10! > 6,9,10, 15!> 21!> -16> 0! >12!> 33! >32
 * !표시가 되어있는 부분이 Max값이다.
 * 
 */
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
    	int[] A = new int[N];
    	for (int i=0; i<N; i++)
    		A[i] = Integer.parseInt(st.nextToken());
    	int M = -1111;
    	int Sum = 0;
    	for(int i=0; i<N; i++) {
    		Sum += A[i];
    		if(M < Sum) M = Sum;
    		if(Sum < 0) Sum = 0;
    	}
    	System.out.println(M);
    }
}