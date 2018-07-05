package DynamicProgramming.swExpt_3752;
/*
 * 
 * 0 2 3 5
 * 
 * 
 * 0>> 02 03 05
 * 02>> 023 025
 * 023>> 025
 * ...
 * 03 >> 035
 * 05 >> X
 * 035>> X
 * 
 * 2>> 23 25
 * 23>> 235
 * 25>> X
 * 235>> X
 * 
 * 부분집합의 합의 개수 문제,
 * 
 * 위 예시를 보면, 정렬된 수열, 0, 2, 3, 5로 시작하게 하고,
 * 좌측 숫자부터 하나씩 방문한다고 가정하면,
 * 방문했던 숫자는 방문 할 필요가 없어보인다.
 *
 * 
 * BFS, DFS로 풀어보자
 * 
 * 1. 입력받은 수열을 정렬시킨다. 
 * 2. DFS, BFS 둘다 상관없지만, 
 *    위 예시와 비슷하게 BFS를 사용하도록 한다.  
 * 3. 인접 리스트를 사용한다.
 * 4. 	0:235
 * 		2:35
 * 		3:5
 * 		5:
 * 5. 중복이 있는 경우라면?
 *  	0:2235
 *  	2:235
 *  	2:35
 *  	3:5
 *  	5:
 * 6. BFS >>
 * 2, 2, 3, 5는 각각 방문한다.
 * 부분집합 : { 2, 3, 5,
 *  2+2!, 2+3, 2+5,  3+5, 
 *  2+2+{3,5} 2+3+{5}
 *  2+2+3+5
 * 				}
 **********************************
 * 다른 생각... N = 3, {2,3,5}
 * 주어진 배점 {2, 3, 5} 가 있을 때,
 * 연산에 포함할 배점을 1로 표시해보면,
 * 000 :0 >>0
 * 001 :1 >>5
 * 010 :2 >>3
 * 011 :3 >>8
 * 
 * 100 :4 >>2
 * 101 :5 >>7
 * 110 :6 >>5!
 * 111 :7 >>10
 * 			답 7개
 * Arr[0]++
 * Arr[5]++
 * ...
 * Arr[10]++ --> 이 방법은 100이 100개인경우 만개의 데이터가 필요함.
 *
 * 총 8가지 경우가 있다.
 * 
 * 100개면
 * 2^100승... > 불가능
 * 
 */
import java.util.*;
public class Main2 {
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
			
			// in Test
			ArrayList<ArrayList<Integer>> adLists = new ArrayList<>();
			for(int k=0; k <= N; k++) {
				ArrayList<Integer> adList = new ArrayList<>();
				for(int j=k; j <= N; j++) 
					adList.add(in[j]);
				adLists.add(adList);
			}		
			
			chk[0] = true;
			for(int k=0; k<N; k++) {
				int sum = in[k];
				for(int adList : adLists.get(k)) {
					sum += adList;
					chk[sum] = true;
					System.out.println(sum);
				}
			}
			
			for(int k=0, size=chk.length; k<size; k++)
				if(chk[k])
					System.out.print(k+" ");
		
			
			
			
		}
	}

}
