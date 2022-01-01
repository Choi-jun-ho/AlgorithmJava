package class1.q2920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		String result = null;
		
		String[] s = br.readLine().split(" ");
		
		boolean check = false;
		
		for (int i = 0; i < s.length; i++) {
			if (i+1 == Integer.parseInt(s[i])) {
				check = true;
			} else {
				check = false;
				break;
			}
		}
		
		if (check) {
			result = "ascending";
		} else {
			for (int i = 0; i < s.length; i++) {
				if (s.length-i == Integer.parseInt(s[i])) {
					check = true;
				} else {
					check = false;
					result = "mixed";
					break;
				}
			}
			
			if (check) {
				result = "descending";
			}
		}
		
		bw.write(result);
		
		bw.flush();
		bw.close();
	}
}
