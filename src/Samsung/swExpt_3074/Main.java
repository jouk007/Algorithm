package Samsung.swExpt_3074;

import java.util.*;

/*
 * 1 <= N <= 10^5 , 1 <= M <= 10^9
 * 
 * 1) N < M
 * 
 * 2 | 1  4  6  10 17 
 * 3 | 2  7  13 18
 * 3 | 3  8  14 19
 * 4 | 5  11 20
 * 6 | 9  15 21
 * 8 | 12 
 * 9 | 16
 * 
 * 이처럼 tk를 정렬했을때,
 * 가장 낮은 값부터 채워나가는 성질을 가진다.
 * 2>3>3>4>4>6>6>6>6>8>8>8>9>9>...
 * tk[0] > tk[1] > tk[2] > tk[0]*2 > tk[3] > tk[0]*3
 * 
 * 여기서 M=10이면 10번째까지만 돌려서, 8을 구하면 된다.
 * 구현은 다음과같이 한다.
 * 
 * 각 tk마다 반복되는 횟수는 ck에 담는다.
 * 
 * for i=0; i<N; i++ {
 * 
 * }
 * 
 * 2) N > M
 *  
 * 
 * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			sc.nextLine();
			int[] tk = new int[N+1];
			for(int k=1; k<=N; k++) {
				tk[k] = sc.nextInt();
				sc.nextLine();
			}
			Arrays.sort(tk);
			go(tk, M);
		}
	}
	static void go(int[] tk, int M){
		
	}
}