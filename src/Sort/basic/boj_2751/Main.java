package Sort.basic.boj_2751;

import java.util.*;
import java.io.*;
`````````````public class Main {
	public static void main(String []args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		if(N==1L) {
			System.out.println(1);
			System.exit(0);
		}
		int j = 1;
		long M[] = new long[20000];
		for(long i=1; i<=1000000050; i=i+6*(j++))  
			M[j] = i;
		
		for(j=0; j<M.length; j++) {
			if(M[j] > N) {
				System.out.println(j);
				break;
			}
		}
	}
}
