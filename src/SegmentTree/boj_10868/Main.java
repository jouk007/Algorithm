package SegmentTree.boj_10868;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = 
    			new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());

    	ArrayList<Integer> tree = new ArrayList<>();
    	// SegmentTree Capacity
    	int K = (int) Math.ceil(Math.log(N)/Math.log(2));
    	K = (int) Math.pow(2, K+1);
    	
    	// init tree
    	for(int i=0; i<K; i++)
    		tree.add(0x7fffffff); // this problem's num is Natural number
    	for(int i=0; i<N; i++)
        	tree.set(K/2+i, Integer.parseInt(br.readLine())); // Keep the Full B-Tree structure by setting leaf node
    	for(int i=K/2-1; i>0; i--) // K/2!!!
    		tree.set(i, Math.min(tree.get(2*i), tree.get(2*i+1))); // Set the child-node value by the parents-node value
    	
    	int start = 0, end = K/2-1;
    	// Enter range(l,r)
    	for(int i=0; i<M; i++) {
    		st = new StringTokenizer(br.readLine());
        	int l = Integer.parseInt(st.nextToken());
        	int r = Integer.parseInt(st.nextToken());
        	int result = segmentTracer(tree, l-1, r-1, start, end, 1);	
        	System.out.println(result);
    	}
    	
    	
//    	// check tree value
//    	Iterator it = tree.iterator();
//    	while(it.hasNext()) {
//    		System.out.println(it.next());
//    	}
    }
    // l=left, r=right, s=start, e=end
    static int segmentTracer(ArrayList<Integer> list, int l, int r, int s, int e, int nodeN) {
    	if(r<s || e<l)
    		return 0x7fffffff;
    	if(l<=s && e<=r)
    		return list.get(nodeN);
    	
    	int mid = (s+e)/2;
    	return Math.min(segmentTracer(list, l, r, s, mid, nodeN*2), segmentTracer(list, l, r, mid+1, e, nodeN*2+1));
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