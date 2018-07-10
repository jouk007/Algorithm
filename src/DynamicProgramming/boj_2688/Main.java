package DynamicProgramming.boj_2688;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * N=1, 0 1 2 3 4 5 6 7 8 9
 * 1*10개
 * A[0] = 10
 * 
 * N=2, 00 01 02 03 04 05 06 07 08 09
 * 		   11 12 13 14 15 16 17 18 19
 *            22 23 24 25 26 27 28 29
 *               33 34 35 36...
 *               	44 ...
 *               		 ..
 *               		   ..
 * (11*10)/2
 * A[1] = (A[0]+1)*A[0]/2
 * 
 * N=3, 000 001 002 003 004 005 006 007 008 009 
 *          011 012 013 014 015 016 017 018 019
 *              022 ... 
 * 					033 ...
 * 						...
 * 		    111 112 113 114 115 116 117 118 119
 * 			    122 123 124 125 126 127 128 129
 * 				    133 ...
 * 						...
 * (11*10)/2 + (10*9)/2 + (9*8)/2 ...
 * 
 * N=4, 0000 0001 0002 0003 0004 0005 0006 0007 0008 0009
 * 			 0011 0012 0013 0014 0015 0016 0017 0018 0019
 *			      0022 ...
 *					   0033 				   
 * 
 * 
 *
 11111111111111111111
 0
 1
 2
 >>3
 
 3개
 22222222222222222222
 00
 01
 02
 >>3
 11
 12
 >>2
 22
 >>1
 
 A[0]+2개+1개
 33333333333333333333
 000
 001
 002
 .>>3
 011
 012
 .>>2
 022
 .>>1
 ...........
 111
 112
 .>>2
 122
 .>>1
 
 222
 .>>1
 A[1]+2+1+1
 
 4444444444444444444444444
 0000
 0001
 0002
 >>3
 0011
 0012
 >>2
 0022
 >>1
 
 0111
 0112
 >>2
 0122
 >>1
 
 0222
 >>1
 ...........
 
 1111
 1112
 >>2
 1122
 >>1
 
 1222
 >>1
 .......
 2222
 >>1
 
 A[2]+
 * 
 * 
 */
public class Main {
	public static void main(String []args) throws NumberFormatException, IOException {
		11111BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
