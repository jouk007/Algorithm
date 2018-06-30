package DynamicProgramming.boj_1149;		

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String []args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int min = 0;
		int A[][] = new int[N+1][3];
		int dp[][] = new int[N+1][3];
		StringTokenizer st;
		for(int i=0; i<N; i++){
			st = new StringTokenizer(br.readLine());
			A[i][0] = Integer.parseInt(st.nextToken());
			A[i][1] = Integer.parseInt(st.nextToken());
			A[i][2] = Integer.parseInt(st.nextToken());
		}

		dp[0][0] = A[0][0];
		dp[0][1] = A[0][1];
		dp[0][2] = A[0][2];
		for(int i=1; i<N; i++){
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + A[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + A[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + A[i][2];
		}
		min = Math.min(dp[N-1][1], dp[N-1][2]);
		min = Math.min(min, dp[N-1][0]);
		System.out.println(min);
	}
}
