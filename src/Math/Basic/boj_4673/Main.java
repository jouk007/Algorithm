package Math.Basic.boj_4673;

import java.util.*;
import java.io.*;
public class Main {
	public static boolean solution(int[] arr) {
        Arrays.sort(arr); 
        return (arr[arr.length-1]==arr.length);
    
    }
	public static void main(String []args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] T = {4,1,3};
		System.out.println(solution(T));
		
	}
}d