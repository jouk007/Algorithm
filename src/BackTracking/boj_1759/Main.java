package BackTracking.boj_1759;
// 개선된 코드
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int C = sc.nextInt();
		char[] s = new char[C];
		for (int i = 0; i < C; i++)
			s[i] = sc.next().charAt(0);
		Arrays.sort(s);
		go(L, s, "", 0);
	}

	static void go(int n, char[] s, String pwd, int i) {
		if (pwd.length() == n) {
			if (check(pwd)) {
				System.out.println(pwd);
			}
			return;
		}
		if (i >= s.length)
			return;
		go(n, s, pwd + s[i], i + 1);
		go(n, s, pwd, i + 1);
	}

	static boolean check(String pwd) {
		int ja = 0;
		int mo = 0;
		for (char x : pwd.toCharArray())
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
				mo += 1;
			else
				ja += 1;
		return ja >= 2 && mo >= 1;
	}
}