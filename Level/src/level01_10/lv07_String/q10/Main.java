package level01_10.lv07_String.q10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int result = 0;
		
		int N = Integer.parseInt(br.readLine());
		
		String[] s = new String[N];
		
		for (int n = 0; n < N; n++) {
			s[n] = br.readLine();
			if (check(s[n]))
				result++;
		}
		
		
		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();
	}
	
	public static boolean check(String string) {
		
		String s = String.valueOf(string.charAt(0));
		
		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i) != string.charAt(i-1)) {
				s += String.valueOf(string.charAt(i));
			}
		}
		
		for (int i = 0; i < s.length(); i++) { // 01234
			for (int j = i+1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					return false;
			}
		}
		
		return true;
	}
}
