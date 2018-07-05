package DynamicProgramming.swExpt_3752;

import java.util.*;
p1111ublic class Main {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=1; i<=T; i++) {
			
			int N = sc.nextInt();
			boolean[] chk = new boolean[10005];
			int[][] A = new int[N+1][N+1];
			int[] in = new int[N+1];
			
			// in = {0, 2, 3, 5}
			for(int j=1; j<=N; j++) 
				in[j] = sc.nextInt();


			
			Arrays.sort(in);
			
			for(int i=1; i<=N; i++) {
				boolean C[] = new boolean[N+1];
				DFS(adLists, C, i, i);
			}
			
			
			
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

}
