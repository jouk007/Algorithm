package Math.Sum.boj_11021;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	private static final String CASE = "Case #";
	private static final String NEW_LINE = "\n";
	
    public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
			sb.append(CASE).append(i+": "+N).append(NEW_LINE);
		}
		System.out.println(sb.toString());
	}
}