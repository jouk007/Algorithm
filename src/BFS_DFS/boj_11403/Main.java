package BFS_DFS.boj_11403;

import java.util.*;
import java.io.*;

class Main {
	static int A[][];
	public static void main(String[] args) {
		sc.init();
		int N = sc.nextInt();
		A = new int[N+1][N+1];
		for(int i=1; i <= N; i++) {
			for(int j=1; j <= N; j++) {
				int a = sc.nextInt();
				A[i][j] = a;
			}
		}
		
		// 인접행렬 --> 인접리스트로
		ArrayList<ArrayList<Integer>> adLists = new ArrayList<>();
		for(int i=1; i <= N; i++) {
			ArrayList<Integer> adList = new ArrayList<>();
			for(int j=1; j <= N; j++) {
				if( A[i][j] > 0 ) {
					adList.add(j);
				}
			}
			adLists.add(adList);
		}
		
		for(int i=1; i<=N; i++) {
			boolean C[] = new boolean[N+1];
			DFS(adLists, C, i, i);
		}
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++)
				System.out.print(A[i][j]+" ");
			System.out.println();
		}
		
	}
	public static void DFS(ArrayList<ArrayList<Integer>> adLists, boolean[] C, int V, int i) {
		if(C[V]) {
			return;
		}
		C[V] = true;	
		for(int adList : adLists.get(V-1)) {
			A[i][adList] = 1;
//			System.out.println("V["+i+"] : "+adList+" ");
			if(!C[adList]) 
				DFS(adLists, C, adList, i);
		}
	}
	public static void D(int[][] A, int[] C, int V) {
		C[V] = 1;
		System.out.print(V+" ");
		for(int i = 1; i < A.length; i++) {
			if(C[i]!=1&&A[V][i]==1) D(A, C, i);
		}
	}
	
	public static void B(int[][] A, int[] C, int V) {
		Queue<Integer> Q = new LinkedList<Integer>();
		C[V] = 1;
		Q.add(V);
	    
		while(!Q.isEmpty()) {
			int n = Q.poll();
			System.out.print(n+" ");
			for(int i = 0; i < A.length; i++) {
				if(C[i]!=1&&A[n][i]==1) {
					Q.add(i);
					C[i] = 1;
				}
			}
		}
	}
	
	
	
	
	
	static class sc {
		private static BufferedReader br;
		private static StringTokenizer st;

		static void init() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		static String readLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
			}
			return null;
		}

		static String readLineReplace() {
			try {
				return br.readLine().replaceAll("\\s+", "");
			} catch (IOException e) {
			}
			return null;
		}

		static String next() {
			while (!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		static long nextLong() {
			return Long.parseLong(next());
		}

		static int nextInt() {
			return Integer.parseInt(next());
		}

		static double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}