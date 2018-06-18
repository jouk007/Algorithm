package SegmentTree.boj_6549;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = 
    			new BufferedReader(
    					new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = 
					new StringTokenizer(br.readLine());
		
			long[] h = new long[100005];  
			int cnt = 0;
			
			while(st.hasMoreTokens()) 
				h[cnt++]=Long.parseLong(st.nextToken());
			if( cnt==1 & h[0]==0)
				break;
			long Max = cnt;
			
			
			
			
		}
    }
}

/* 
public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
    	int N, M = 0;
    	int[][] datas;
    	String s = new String();
    	StringBuilder sb = new StringBuilder();
		StringTokenizer st;
    	BufferedReader br = 
    			new BufferedReader(new InputStreamReader(System.in));
    	//N = Integer.parseInt(br.readLine());
		//st = new StringTokenizer(br.readLine());
    	//N = Integer.parseInt(st.nextToken());
    	//M = Integer.parseInt(st.nextToken());
    	Scanner sc = new Scanner(System.in);
    	N = sc.nextInt();
    	
    	}
    	System.out.println(M);
    }
}
*/