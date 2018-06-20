package BackTracking.boj_1759;

import java.util.*;
import java.io.*;

public class Main2 {
	static int N, M =0;
	static int[] flag = new int[15];
	static char[] c = new char[15];
    public static void main(String[] args) throws IOException {
       BufferedReader br = 
             new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st =
             new StringTokenizer(br.readLine());
       N = Integer.parseInt(st.nextToken());
       M = Integer.parseInt(st.nextToken());
       
       String s[] = br.readLine().split(" ");
       Arrays.sort(s); //A = {a,c,i,s,t,w}
       
       for(int i=0; i<M; i++) 
    	   c[i] = s[i].charAt(0);
       
	   func(0,0,0,0);
    }
    static void func(int p, int l, int j, int m) {

    	for(int i=p; i<M; i++) {
    		flag[i] = 1; //앞에서 부터 하나씩 추가
    		func(	i+1, //한칸 앞으로
    				l+1, //길이 증가
    				isM(c[i])?j:(j+1),//자음이면 j+1
    				isM(c[i])?(m+1):m //모음이면  m+1
    						);
    		flag[i] = 0;
    	}
    	
    	if(l==N && j>=2 && m>=1) {
			for(int i=0;i<M;i++) {
				if(flag[i]==1)
					System.out.print(c[i]);
			}
			System.out.println();
    	}
    }
    static boolean isM(char i) {
        if(i=='a'||i=='e'||i=='o'||i=='i'||i=='u' )
        	return true;
        return false;
    }
	
}