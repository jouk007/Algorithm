package BruteForce.boj_1182;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		
		int[] L = new int[N];
		
		for (int i = 0; i < N; i++) 
			L[i]=sc.nextInt();
		
		Arrays.sort(L);

		for (int i = 0; i < N; i++) {
			System.out.print(L[i]);
		}
		
		System.out.println(go(L, 1));
		
		
	}

	static int go(int[] L, int K) {
		
		return 0;
	}

}