package level01_10.lv04_while.q3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main (String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int n = N;

		int i = 0;
		
		while (true) {

			i++;
			int left = n/10;
			int right = n%10;
			int value = left + right;
			n = right*10 + value%10;

			if (n == N) {
				break;
			}
		}

		bw.write(i + "");
		bw.flush();
		bw.close();
		
	}
}
