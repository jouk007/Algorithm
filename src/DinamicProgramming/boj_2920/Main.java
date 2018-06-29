package DinamicProgramming.boj_2920;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String []args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a=0, d=0;
		for(int i=0; i<8; i++) {
			int N = Integer.parseInt(st.nextToken());
			if (N==i+1) a++;
			else if(N==(8-i)) d++;
		}
		if(a==8)
			System.out.println("ascending");
		else if(d==8)
			System.out.println("descending");
		else
			System.out.println("mixed");
	}
}
