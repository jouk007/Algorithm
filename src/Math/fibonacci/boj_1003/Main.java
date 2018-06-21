package Math.fibonacci.boj_1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	private static int[] chk;
	private static final String SPACE = " ";
	private static final String NEW_LINE = "\n";
	
    public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			chk = new int[2];
			int[] A = new int[N+2];
        	A[0] = 1;
        	A[1] = 0; 
            for(int i=2; i<=N+1; i++) {
        		A[i] = A[i-1] + A[i-2]; 
            }
            chk[0] = A[N];
            chk[1] = A[N+1];
			sb.append(chk[0]).append(SPACE).append(chk[1]).append(NEW_LINE);
		}
		System.out.println(sb.toString());
	}
}