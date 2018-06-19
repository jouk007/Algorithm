package BFS_DFS.boj_1260;

import java.util.*;
import java.io.*;

class Main {
	static int[][] A;
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int N = S.nextInt(), M = S.nextInt(), V = S.nextInt();
		A = new int[N+1][N+1];
		int C[] = new int[N+1];
		int i = 0;
		
		for(; i < M; i++) {
			int a = S.nextInt(), b = S.nextInt();
			A[a][b] = A[b][a] = 1;
		}
		D(A, C, V);
		C = new int[N+1];
		System.out.println();
		B(A, C, V);
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
	static int[] vbfsCheck;
    static void BFS(int Start, int size) {
    	Deque<Integer> dq = new LinkedList<>();
    	dq.add(Start);
		vbfsCheck[Start]++;
    	int p;
    	while(!dq.isEmpty()) {
    		p = dq.remove();
    		System.out.print(p+" ");
	    	for(int i=1; i<=size; i++) {
				if(A[p][i]!=0 && vbfsCheck[i]==0) {
					dq.add(i);
		    		vbfsCheck[i]++;
				}
	    	}
    	}
    }    
	static int[] vdfsCheck;
    static void DFS(int Start, int size) {
    	Deque<Integer> dq = new LinkedList<>();
    	
    	dq.push(Start);
    	int p = Start;
		System.out.print(p+" ");
		vdfsCheck[p]++;
		
    	while(!dq.isEmpty()) {
    		p = dq.peek();
    		boolean flag = false;
	    	for(int i=1; i<=size; i++) {
				if(A[p][i]!=0 && vdfsCheck[i]==0) {
					System.out.print(i+" ");
					dq.push(i);
					vdfsCheck[i]++;
		    		flag = true;
					break;
				}
	    	}
	    	if(!flag) 
	    		dq.pop();
	    	
    	}
    }
}
/* 
public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
    	int N, M = 0;
    	int[][] datas;
    	String s = new String();
    	StringBuilder sb = new StringBuilder();
		StringTokenizer st;
    	BufferedReader br = 
    			new BufferedReader(new InputStreamReader(System.in));
    	//N = Integer.parseInt(br.readLine());
		//st = new StringTokenizer(br.readLine());
    	//N = Integer.parseInt(st.nextToken());
    	//M = Integer.parseInt(st.nextToken());
    	Scanner sc = new Scanner(System.in);
    	N = sc.nextInt();
    	
    	}
    	System.out.println(M);
    }
}
*/