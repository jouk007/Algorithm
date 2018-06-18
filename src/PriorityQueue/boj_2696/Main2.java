package PriorityQueue.boj_2696;

import java.util.*;
import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = 
    			new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
    	int N, M = 0;
    	for(int i=0; i<T; i++) {
    		M = Integer.parseInt(br.readLine());
    		System.out.println( (M+1)/2 );
    		ArrayList<Integer> q = new ArrayList<>();
    		ArrayList<Integer> q2 = new ArrayList<>();
        	q.add(0);
        	q2.add(0);
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	StringBuilder sb = new StringBuilder();
        	for(int j=0; j<M; j++) {
        		if(!st.hasMoreTokens())
        			st = new StringTokenizer(br.readLine());
            	N = Integer.parseInt(st.nextToken());
    			if( q.size() == 1 ) {
//    				System.out.print(N);
    				sb.append(N+" ");
                	q.add(N);
    			}
    			else if ( q2.size() == 1 ) {
    				if( q.get(1) < N)
    					q2.add(N);
    				else { // N < q
    					q2.add(q.remove(1));
    					q.add(N);    					
    				}
    			}
    			else if( q.size() == q2.size() ) {
    				if(q.get(1) < N && N < q2.get(1)) {
//    					System.out.print(N);
        				sb.append(N+" ");
    					q.add(N);
    					sorting_q(q);
    				}
    				else if( N < q.get(1) ) {
//    					System.out.print(q.get(1));
        				sb.append(q.get(1)+" ");    					
    					q.add(N);
    					sorting_q(q);
    				}
    				else if( q2.get(1) < N ) {
//    					System.out.print(q2.get(1));
        				sb.append(q2.get(1)+" ");  
    					q2.add(N);
    					sorting_q2(q2);
    				}
    				else 
    					System.out.print("what Happen? 1");
    			}
    			else if( q.size() != q2.size() ) {
    				if ( q.size() > q2.size() ) {
    					if( N < q.get(1)) {
    						q2.add(q.get(1));
    						// remove
    						pop_q(q);
    						sorting_q2(q2);
    						q.add(N);
    						sorting_q(q);
    					}
    					else {
	    					q2.add(N);
	    					sorting_q2(q2);
    					}
    				}
    				else if( q.size() < q2.size() ) {
    					if( q2.get(1) < N ) {
    						q.add(q2.get(1));
    						// remove
    						pop_q2(q2);
    						sorting_q(q);
    						q2.add(N);
    						sorting_q2(q2);
    					}
    					else { 
	    					q.add(N);
	    					sorting_q(q);
    					}
    				}
    			}
				else 
					System.out.println("what Happen? 2");
	    		if(j%20 == 18) {
	            	System.out.println(sb);
	            	sb = new StringBuilder();
	    		}
        	}
        	System.out.println(sb);
        	q.clear();
        	q2.clear();
        
        	
    	}
        	

    }
    static void swap_q(ArrayList<Integer> q, int x, int y) {
    	int tmpX = q.get(x);
    	int tmpY = q.get(y);
    	q.set(x, tmpY);
    	q.set(y, tmpX);
    }
	static void sorting_q2(ArrayList<Integer> q) {
		int s = q.size()-1;
		while(s > 1) {
			int pNode = q.get(s/2);
			int cNode = q.get(s);
			if(cNode < pNode) { // min heap !
				swap_q(q, s, s/2);
			}
			s /= 2;
		}
	}
	static void sorting_q(ArrayList<Integer> q) {
		int s = q.size()-1;
		while(s > 1) {
			int pNode = q.get(s/2);
			int cNode = q.get(s);
			if(cNode > pNode) { // max heap !
				swap_q(q, s, s/2);
			}
			s /= 2;
		}
	}
	static void pop_q2(ArrayList<Integer> q) {
		// swap RootNode <-> LeafNode and remove
		int r = 1;
		swap_q(q, 1, q.size()-1);
		q.remove(q.size()-1);
		
		// sorting (parent <-> child)
		while(true) {
			if(r*2+1<q.size()) {
				if(q.get(r*2) > q.get(r*2+1)) {
					if(q.get(r) > q.get(r*2+1)) {
						swap_q(q, r, r*2+1);
						r = r*2+1;
					}
					else
						break;
				}
				else {
					if(q.get(r) > q.get(r*2)) {
						swap_q(q, r, r*2);
						r = r*2;
					}
					else
						break;
				}
			}
			else if(r*2<q.size()) {
					if(q.get(r) > q.get(r*2)) {
						swap_q(q, r, r*2);
						r = r*2;
					}
					else
						break;
			}
			else
				break;
		}
	}
	static void pop_q(ArrayList<Integer> q) {
		// swap RootNode <-> LeafNode and remove
		int r = 1;
		swap_q(q, 1, q.size()-1);
		q.remove(q.size()-1);
		
		// sorting (parent <-> child)
		while(true) {
			if(r*2+1<q.size()) {
				if(q.get(r*2) < q.get(r*2+1)) {
					if(q.get(r) < q.get(r*2+1)) {
						swap_q(q, r, r*2+1);
						r = r*2+1;
					}
					else
						break;
				}
				else {
					if(q.get(r) < q.get(r*2)) {
						swap_q(q, r, r*2);
						r = r*2;
					}
					else
						break;
				}
			}
			else if(r*2<q.size()) {
					if(q.get(r) < q.get(r*2)) {
						swap_q(q, r, r*2);
						r = r*2;
					}
					else
						break;
			}
			else
				break;
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