package level11_20.lv11_brute_force.q5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuffer sb = new StringBuffer();
		
		int N = Integer.parseInt(br.readLine());
		
		int result = 0;
		int n = 0;
		
		for (result = 0;; result++) {
			String sr = String.valueOf(result);
						
			if (sr.contains("666")) {
				n++;
			}
			
			if (n == N) {
				break;
			}
		}
		
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}	
}
