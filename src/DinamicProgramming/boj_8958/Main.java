package DinamicProgramming.boj_8958;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String []args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int M = 0, K = 0;
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			K=0;M=0;
			for(int j=0, size=s.length(); j<size; j++) {
				if( s.charAt(j) == 'O' ) {
					K += M;
					M++;
				}
				else { 
					K += M;
					M=0;
				}
			}
			K +=M;
			System.out.println(K);
		}
	}
}
