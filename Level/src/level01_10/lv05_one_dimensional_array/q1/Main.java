package level01_10.lv05_one_dimensional_array.q1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int[] iArr = new int[N];
		
		for (int i = 0; i < N; i++) {
			iArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int small = iArr[0];
		int big = iArr[0];
		
		for (int i = 1; i < N; i++) {
			if (iArr[i] < small) {
				small = iArr[i];
			}
			if (iArr[i] > big) {
				big = iArr[i];
			}
		}
		
		bw.write(small + " " + big);
		
		bw.flush();
		bw.close();
				
	}

}
