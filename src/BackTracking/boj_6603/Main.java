package BackTracking.boj_6603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	static int[] out;
	public static void main(String[] args) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;// = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(true) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			if(N == 0) System.exit(0);
			
			int[] A = new int[N+1];
			for (int i=0; i<N; i++)
	    		A[i] = Integer.parseInt(st.nextToken());
			
			out = new int[N+1];
//			for(int i=0; i<=N-6; i++)
				go(N, A, 0, 0);
			System.out.println();
		}
	}

	static void go(int n, int[] a, int K, int index) {
//		if(!check(a,index)) return;
		
		if(index == 6){
			for(int i=0; i<6; i++)
				System.out.print(out[i]+" ");
			System.out.println();
			return;
		}
		for(int j=K; j<n; j++){
			out[index] = a[j];
			go(n, a, j+1, index+1);
		}
		return;
	}

	static boolean check(int[] a, int i) {
		if(i<1) return true;
		return a[i-1] < a[i];
	}
}