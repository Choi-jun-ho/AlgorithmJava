package level01_10.lv05_one_dimensional_array.q3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
						
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		int result = A * B * C;
		String s = result + "";
		
		String[] sArr = s.split("");
		
		int[] iArr = new int[10];
		
		for (String string : sArr) {
			for (int i = 0; i < 10; i++) {
				if (i == Integer.parseInt(string)) {
					iArr[i]++;
				}
			}
		}
		
		for (int i : iArr) {
			bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();
				
	}

}
