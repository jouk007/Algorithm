package DynamicProgramming.swExpt_4613;

import java.util.*;
public class Main {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int T = sc.nextInt();
	   for(int i=1; i<=T; i++) {
		   int N = sc.nextInt();
		   int M = sc.nextInt();
		   sc.nextLine();
		   
		   char[][] A = new char[N][M];
		   
		   // 0:W 	1:B 	2:R
		   int[][] cnt = new int[N][3];
		   for(int j=0; j<N; j++) {
			   String s = sc.nextLine();
			   for(int k=0; k<M; k++) {
				   A[j][k]= s.charAt(k);
			   }
			   for(int k=0; k<M; k++) {
				   // cnt(W) 칠하는 칸의 개수
				   if(j==0 && A[0][k]!='W')
					   cnt[0][0]++;
				   
				   // B 칠하는 칸의 개수
				   if(0<j && j<N-1) {
					   if(A[j][k]!='W')
						   cnt[j][0]++;
					   if(A[j][k]!='B')
						   cnt[j][1]++;
					   if(A[j][k]!='R')
						   cnt[j][2]++;
				   }

				   // R 칠하는 칸의 개수
				   if(j==N-1 && A[N-1][k]!='R')
					   cnt[N-1][2]++;
					   
			   }
		   }
		   // 칠하는 횟수를 모두 구했으니,
		   // 가운데 구간은 WBR 자유롭게 ... N:5인 경우
		   // WBRRR WWBRR WWWBR 세가지 경우를 모두 해 봐야 한다. 
		   // cnt(BRR), cnt(WBR), cnt(WWB)의 최솟값을 구하고 싶은데...
		   // B를 1, 2, 3칸으로 옮기면서 좌측엔 W, 우측엔 R을 해보자......
		   // cnt(B)의 갯수는 1~N-2개가 가능하다.
		   // 
		   int ans = 0x7fffffff;
		   // 0:W   (1 ~ N-1)  N:R
		   for(int y=1; y<=N-2; y++) { // y는  B의 갯수, W,R을 빼서 -2
			   for(int k=1; k<=(N-2)-y+1; k++) {
				   int sum = 0;
				   // B의 갯수가 y로 정해졌고, 이제 B가 시작할 위치 k를 따라 W,R을 칠하자
				   for(int w=0; w<k; w++) { // k전까지 칠한다.
					   sum += cnt[w][0];
				   }
				   for(int b=k; b<k+y; b++) { // k부터 갯수 y만큼 칠한다
					   sum += cnt[b][1];
				   }
				   for(int r=k+y; r<=N-1; r++) { //k+y부터 마지막까지 칠한다.
					   sum += cnt[r][2];
				   }
				   if(ans > sum)
					   ans = sum;
			   }
		   }
		   System.out.println("#"+i+" "+ans);
	   }
   }
}
