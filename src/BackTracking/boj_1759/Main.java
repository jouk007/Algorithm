package BackTracking.boj_1759;

import java.util.*;
import java.io.*;

public class Main {
   static String[] sa = new String[1000];
   static int saCnt = 0;
   static int N, M =0;
    public static void main(String[] args) throws IOException {
       BufferedReader br = 
             new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st =
             new StringTokenizer(br.readLine());
       N = Integer.parseInt(st.nextToken());
       M = Integer.parseInt(st.nextToken());
       String[] s = br.readLine().split(" ");
       ArrayList<String> A = new ArrayList<>();
       int[] c = new int[M+1];
       int count = 0;
       Arrays.sort(s);
       for(int j=0;j<M;j++){
          char i = s[j].charAt(0);
          
          A.add(s[j]);
           if(i=='a'||i=='e'||i=='o'||i=='i'||i=='u' ){
              c[j]++;
              count++;
           }
       }
       
       for(int i=M-1;i>=1;i--){
          for(int j=M-2;j>=0;j--){
             if(i==j)
                continue;
             int cnt = count;
             saCnt++;
             for(int k=0; k<M; k++){
                if(k!=j && k!=i){
                   if(c[k]>0)
                      cnt--;
                  sa[saCnt] += s[k];
                }
             }
            System.out.println(sa[saCnt]);   
          }
       }

    }
}