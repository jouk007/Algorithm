package BackTracking.boj_9663;

import java.util.*;
public class Main {
	static int result = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++){
			A[0]=i;
			go(A, 0);
		}
		System.out.println(result);
	}
	

	static void go(int[] a, int i)	{
		if(!check(a, i)) return;
		if(i==a.length-1){
			result++; return;
		}
		for(int k=0; k<a.length; k++){
			a[i+1]=k;
			go(a, i+1);
		}
	}

	static boolean check(int[] a, int i) {
		for(int x=0; x<i; x++){
			if(a[i]==a[x])	return false;
			if(i-x==Math.abs(a[x]-a[i])) return false;
		}
		return true;
	}
}