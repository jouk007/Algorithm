package SegmentTree.boj_6549;

import java.util.*;
import java.io.*;
	

public class Main {
	static int N = 0;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = 
    			new BufferedReader(
    					new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = 
					new StringTokenizer(br.readLine());

	    	ArrayList<Long> tree = new ArrayList<>();
	    	
			// Data Length
			N = Integer.parseInt(st.nextToken());
			// Calc a SegmentTree Capacity
			int K = (int) Math.ceil(Math.log(N)/Math.log(2));
	    	K = (int) Math.pow(2, K+1);
					   	
	    	// init tree
	    	for(int i=0; i<K; i++)
	    		tree.add(0x7FFFFFFFFFFFFFFFL);
	    	for(int i=0; i<N; i++)
				tree.set(K>>1+i, Long.parseLong(st.nextToken())); // Keep the Full B-Tree structure by setting leaf node
	    	if(tree.get(1)==0 && N == 1) // exit signal
				break;
	    	for(int i=K>>1-1; i>0; i--)
	    		tree.set(i, Math.min(tree.get(i<<1), tree.get(i<<1+1))); // Set the child-node value by the parents-node value
	    	// ... init

			Long maxRect = 0L;
			
	    	int start = 0, end = K>>1-1;
	    	for(int i=1; i<=N; i++) {
		    	//Long pResult = 0L;
	    		for(int j=i; j<=N; j++) {
		        	int l = i;
		        	int r = j;
		        	Long result = segmentTracer(tree, l-1, r-1, start, end, 1);	

	    			System.out.println("l :"+ l+" r :"+ r);
	    			System.out.println("result * (r-l+1):"+ result+"*"+ (r-l+1) +":"+ (result * (r-l+1)));
		        	maxRect = Math.max(maxRect, result * (r-l+1));
	    		}
	    	}
	    	System.out.println("maxRect: "+maxRect);
		}//... while
    }
    static Long segmentTracer(ArrayList<Long> list, int l, int r, int s, int e, int nodeN) {
    	if(r<s || e<l)
    		return 0x7FFFFFFFFFFFFFFFL;
    	if(l<=s && e<=r)
    		return list.get(nodeN);
    	int mid = (s+e)>>1;
    	return Math.min(segmentTracer(list, l, r, s, mid, nodeN<<1), segmentTracer(list, l, r, mid+1, e, nodeN<<1+1));
    }
    static Long dividConq(ArrayList<Long> list, int s, int e) {
    	
    	
		return 0L;
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