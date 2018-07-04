package SWExpt_1767;

import java.util.*;

public class Main {

	static class Point{
		int X;
		int Y;
		Point(int x, int y){
			X=x; Y=y;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0){
			int N = sc.nextInt();
			int[][] A = new int[N+1][N+1];
			for(int i=0; i<N; i++)
				for(int j=0; j<N; j++)
					A[i][j]=sc.nextInt();
			
			int max = 0;
			HashSet<Point> aL = new HashSet<>();
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					int cntX = 0; int cntY = 0;
					if(A[i][j]>0){
						for(int k=0; k<N; k++){
							if(A[i][k]>0)
								cntX++;
							if(A[k][j]>0)
								cntY++;
						}
						int cnt = cntX+cntY-1;
						if(cnt>max)
							max = cnt;
						aL.(cnt, new Point(i,j));
						A[i][j]=cnt;
					}
				}
			}

			
			
			
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					System.out.print(A[i][j]);
				}
				System.out.println();
			}
			System.out.println();
		}
		

	}

}
