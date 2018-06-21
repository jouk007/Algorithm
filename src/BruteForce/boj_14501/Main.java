package BruteForce.boj_14501;

import java.util.*;
public class Main {
	static int Pf=0;
	static int N,M=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[] T = new int[N];
		int[] P = new int[N];
		for(int i=0; i<N; i++) {
			T[i]=sc.nextInt();
			P[i]=sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			if(i+T[i] > N) continue;
			//System.out.println("start: "+i);
			go(T,P,i+T[i],P[i]);
		}
		System.out.println(Pf);
	}
	static void go(int[] T, int[] P, int K, int Sum) {
		if(Pf<Sum)	Pf=Sum;//{System.out.println(Pf);Pf=Sum;System.out.println(K+":"+Pf);}
		for (int i = K; i < N; i++) {
			//System.out.println(i+", T: "+T[i]+", P: "+P[i]+" Sum: "+Sum);
			if(i+T[i] > N) continue;
			go(T, P, i+T[i], Sum+P[i]);
		}
	}
}