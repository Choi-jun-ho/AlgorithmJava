package class1.q2475;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] s = br.readLine().split(" ");
		
		int[] iArr = new int[s.length];
		
		int sum = 0;
		
		for (int i = 0; i < iArr.length; i++) {
			int a = Integer.parseInt(s[i]);
			iArr[i] = a * a;
			sum += iArr[i];
		}
		
		int result = sum%10;		
		
		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();
	}
}
