//package BackTracking.boj_6603;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//public class Main {
//	public static void main(String[] args) throws NumberFormatException, IOException{
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;// = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();
//		while(true) {
//			st = new StringTokenizer(br.readLine());
//			int N = Integer.parseInt(st.nextToken());
//			if(N == 0) System.exit(0);
//			
//			int[] A = new int[N+1];
//			for (int i=0; i<N; i++)
//	    		A[i] = Integer.parseInt(st.nextToken());
//			
//			for(int i=0; i<N-5; i++){
//				System.out.print(A[i]+" ");
//				go(N, A, i);
//			}
//		}
//	}
//
//	static void go(int n, int[] a, int i) {
//		if(!check(a,i)) return;
//		if(i==n-2){
//			System.out.println();
//			return;
//		}
//		for(int j=i; j<n; j++){
//			System.out.print(a[i+1]+" ");
//			go(n, a, i+1);
//		}
//		return;
//	}
//
//	static boolean check(int[] a, int i) {
//		if(i<1) return true;
//		return a[i-1] < a[i];
//	}
//}