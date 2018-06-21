package BackTracking.boj_6603;
import java.util.*;
public class Main {
//	static int[] ans;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while(true){
//			int K = sc.nextInt();
//			if(K==0) break;
//			int[] A = new int[K];
//			ans = new int[K];
//			for(int i=0; i<K; i++)
//				A[i] = sc.nextInt();
//			for(int i=0; i<K-5; i++){
//				ans[0]=A[i];
//				go(K, A, i);
//			}
//		}
//	}
//
//	static void go(int n, int[] a, int i) {
//		if(!check(a,i)) return;
//		if(i==n-1){
//			for(int j=0; j<n; j++)
//				System.out.print(ans[j]+" ");
//			System.out.println();
//			return;
//		}
//		for(int j=i; j<n-5; j++){
//			ans[i+1]=a[j];
//			go(n, a, i+1);
//		}
//		return;
//	}
//
//	static boolean check(int[] a, int i) {
//		for(int x=0; x<i; x++){
//			if(ans[i] <= ans[x]) return false;
//		}
//		return true;
//	}
//}