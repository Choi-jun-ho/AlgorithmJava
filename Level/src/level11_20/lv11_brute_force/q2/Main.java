package level11_20.lv11_brute_force.q2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sN = br.readLine();
		int N = Integer.parseInt(sN);
		
		int cons = N;
		int min = N - sN.length()*9;
		
		if (min < 0) {
			min = 0;
		}
		
		for (int i = min; i <= N; i++) {
			String[] consNumber = String.valueOf(i).split("");
			
			int temp = i;
			int a;
			for (int j = 0; j < consNumber.length; j++) {
				a = Integer.parseInt(consNumber[j]);
				temp += a;
			}
						
			if (temp == N) {
				cons = i;
				break;
			}
			
		}
		
		if (cons == N) {
			cons = 0;
		}
		
		bw.write(String.valueOf(cons));
		
		bw.flush();
		bw.close();
		
	}

}

