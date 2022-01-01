package level01_10.lv07_String.q02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		String[] number = br.readLine().split("");
		int sum = 0;
		
		for (int i = 0; i < T; i++) {
			sum += Integer.parseInt(number[i]);
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
	}

}
