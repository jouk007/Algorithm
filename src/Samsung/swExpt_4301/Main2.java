package Samsung.swExpt_4301;

import java.util.*;
import java.io.*;
public class Main2 {
    static int n ,m,ans,cnt,cnt2;
    static boolean check , check2,map[][];
 public static void main(String[] args) throws IOException {
    BufferedReader  bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st ;
    int testcase = Integer.parseInt(bf.readLine());
    for(int t=1; t<=testcase ; t++) {
        st = new StringTokenizer(bf.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new boolean[n][m];
        ans = 0;
        cnt = 0;
        cnt2 = 0;
        check = true;
        check2 = true;
        for(int i=0; i<n; i++) {
            cnt ++;
            check2 = check;
            cnt2 = 0;
            for(int j =0; j<m; j++){
                map[i][j] = check2;
                cnt2+=1;
                if(cnt2 == 2){
                    check2 = check2 ==true ? false : true;
                    cnt2 = 0;
                }
            }
            if(cnt ==2){
                check = check == true? false : true;
                cnt = 0;
            }
        }
        for(int i =0; i<n; i++) {
            for(int j =0; j<m; j++) {
                if(map[i][j] == true) {
                    ans+=1;
                }
            }
        }
        System.out.println("#"+t+" "+ans);
    }
    bf.close();
 }
}
