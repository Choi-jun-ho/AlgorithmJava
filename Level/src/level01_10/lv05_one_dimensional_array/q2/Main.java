package level01_10.lv05_one_dimensional_array.q2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int N = 9;
		
		int[] iArr = new int[N];
		
		int bigPivot = 0;
		int big = 0;

		for (int i = 0; i < N; i++) {
			iArr[i] = Integer.parseInt(br.readLine());
			if (big < iArr[i]) {
				big = iArr[i];
				bigPivot = i+1;
			}
		}
		
		bw.write(big + "\n" + bigPivot);
		
		bw.flush();
		bw.close();
				
	}

}
