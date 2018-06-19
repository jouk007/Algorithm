package BFS_DFS.boj_9466;
import java.util.*;
import java.io.*;

class Main {
	static int A[];
	static int B;
	static int C[];
	public static void main(String[] args) throws IOException {
		
    	BufferedReader br = 
    			new BufferedReader(new InputStreamReader(System.in));
    	int T = Integer.parseInt(br.readLine());
    	
		for(int k=1; k<=T; k++) {			
			int N = Integer.parseInt(br.readLine());    
			A = new int[N+1];
			StringTokenizer st = 
	    			new StringTokenizer(br.readLine());
			int A[] = new int[N+1];
			
			for(int i=1; i <= N; i++) 
				A[i] = Integer.parseInt(st.nextToken());

			B = 0;
			C =  new int[N+1];
			for(int i=1; i <= N; i++) {
				D(A, C, i, 1);
			}
			System.out.println(N-B);
		}	
	}
	
	public static void D(int[] A, int[] C, int V, int K) {
		// V: i.. A[i]==V ..A[V].. , K: i
		// 1. 1->1 
		// 2. 1->2<->3  
		// 3. 1->2->3->1 
		// 4. 1<->2
		// 5. 1->2->3->3
		if(C[V] == -1) return;
		if(C[V] > 0) {
			B += K - C[V];
			return;
		}
		C[V] = K;
		D(A, C, A[V], ++K);
		C[V] = -1;
	}
	
}