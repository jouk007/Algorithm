package PriorityQueue.boj_1927;

import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Integer> q = new ArrayList<>();
    public static void main(String[] args) throws IOException {
    	BufferedReader br = 
    			new BufferedReader(new InputStreamReader(System.in));
    	q.add(0);
//    	StringTokenizer st = new StringTokenizer(br.readLine());
//    	int N = Integer.parseInt(st.nextToken());
    	int N = Integer.parseInt(br.readLine());
    	for(int i=0; i<N; i++) {
    		int M = Integer.parseInt(br.readLine());
    		if(M==0) {
    			if(q.size()==1)
    				System.out.println(q.get(0));
    			else {
    				System.out.println(q.get(1));
    				
    				// swap RootNode <-> LeafNode and remove
    				int r = 1;
    				swap(1, q.size()-1);
    				q.remove(q.size()-1);
    				
    				// sorting (parent <-> child)
    				while(true) {
    					if(r*2+1<q.size()) {
    						if(q.get(r*2) > q.get(r*2+1)) {
    							if(q.get(r) > q.get(r*2+1)) {
    								swap(r, r*2+1);
    								r = r*2+1;
    							}
    							else
    								break;
    						}
    						else {
    							if(q.get(r) > q.get(r*2)) {
    								swap(r, r*2);
    								r = r*2;
    							}
    							else
    								break;
    						}
    					}
    					else if(r*2<q.size()) {
    							if(q.get(r) > q.get(r*2)) {
    								swap(r, r*2);
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
    		else {
    			q.add(M);
    			int s = q.size()-1;
    			while(s > 1) {
					int pNode = q.get(s/2);
					int cNode = q.get(s);
    				if(cNode < pNode) {
    					swap(s, s/2);
	    			}
    				s /= 2;
    			}
    		}
        		
    	}
    }
    static void swap(int x, int y) {
    	int tmpX = q.get(x);
    	int tmpY = q.get(y);
    	q.set(x, tmpY);
    	q.set(y, tmpX);
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