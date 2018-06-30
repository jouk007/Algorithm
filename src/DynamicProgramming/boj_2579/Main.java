package DynamicProgramming.boj_2579;		

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String []args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int Max = 0;
		int A[] = new int[N+1];
		int dp[][] = new int[N+1][3];
		for(int i=1; i<=N; i++)
			A[i] = Integer.parseInt(br.readLine());
		
		dp[1][1] = A[1];
		for(int i=2; i<=N; i++){
			dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]);//안밟는다. + A[i]; 
			dp[i][1] = dp[i-1][0] + A[i];
			dp[i][2] = dp[i-1][1] + A[i];
		}
		//마지막은 반드시 밟아야 하므로 dp[N][0]은 제외한다.
		Max = Math.max(dp[N][1], dp[N][2]);
		System.out.println(Max);
	}
}
