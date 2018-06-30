package String.Basic.boj_1475;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String []args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		s = s.toUpperCase();
		
		int[] A = new int[30];
		for(int i=0; i<s.length(); i++)
			A[s.charAt(i)-'A']++;
		int c=0;
		int M=0;
		for(int i=0; i<30; i++){
			if(M<A[i]){
				M=A[i];
				c=i;
			}
		}
		char res = (char)(c+'A');
		for(int i=0;i <30; i++)
			if (M == A[i] && c!=i)
				res = '?';
		System.out.println(res);
	}
}
