package PriorityQueue.boj_2696;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = 
    			new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
    	int N, M = 0;
    	for(int i=0; i<T; i++) {
    		M = Integer.parseInt(br.readLine());
    		System.out.println( (M+1)/2 );
    		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(10005, Collections.reverseOrder());
    		minHeap.add(0x7fffffff);
    		maxHeap.add(-0x7fffffff);
    		
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	StringBuilder sb = new StringBuilder();
        	for(int j=0; j<M; j++) {
        		if(!st.hasMoreTokens())
        			st = new StringTokenizer(br.readLine());
            	N = Integer.parseInt(st.nextToken());
            	if(j%2 == 0) {
            		if(minHeap.peek() >= N)
            			maxHeap.add(N);
            		else {
            			maxHeap.add(minHeap.peek());
            			minHeap.poll();
            			minHeap.add(N);
            		}
            		sb.append(maxHeap.peek()+" ");
    	    		if(j%20 == 18) {
    	            	System.out.println(sb);
    	            	sb = new StringBuilder();
    	    		}
            	}
            	else {
            		if(maxHeap.peek() <= N)
            			minHeap.add(N);
            		else {
            			minHeap.add(maxHeap.peek());
            			maxHeap.poll();
            			maxHeap.add(N);
            		}
            	}
        	}
        	System.out.println(sb);
        	minHeap.clear();
        	maxHeap.clear();
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