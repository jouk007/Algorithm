package Sort.basic.boj_2959;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A[] = new int[4];
		for(int i=0;i<4;i++)
			A[i] = s.nextInt();
		Arrays.sort(A);
		
		System.out.println(A[0]*A[2]);
	}
}
