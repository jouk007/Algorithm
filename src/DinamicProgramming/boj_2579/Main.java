package DinamicProgramming.boj_2579;
import java.util.*;
import java.io.*;
1111111111111111public class Main {
	public static void main(String []args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int A[] = new int[N];
		int B[][] = new int[N][2];
		
		for(int i=0; i<N; i++) 
			A[i] = Integer.parseInt(br.readLine());
		int Max = 0;
		for(int i=1; i<N; i++) {
			if(i-2 >= 0)// 한 계단 갔을 때
				B[i][0] = A[i-2]+A[i];
			// 연속 두 계단 갔을 때 (다음엔 2칸가야함)
			B[i][1] = A[i-1]+A[i];
			
			if( A[i-1] < A[i] ) {
				Max += A[i];
				i++;
			}
			else
				Max += A[i-1];
		}
		System.out.println(Max);
	}
}
