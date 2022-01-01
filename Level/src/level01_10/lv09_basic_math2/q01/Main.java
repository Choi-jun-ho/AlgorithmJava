package level01_10.lv09_basic_math2.q01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
				
		int result = 0;

		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < T; i++) {
			if (isPrimeNum(Integer.parseInt(st.nextToken()))) {
				result++;
			}
		}
		
		bw.write(String.valueOf(result) + "\n");
		bw.flush();
		bw.close();
		
	}
	
	public static boolean isPrimeNum(int num) {
		
		if (num == 1) {
			return false;
		}
		
		for (int i = 2; i < num; i++) {

			if (num % i == 0)
				return false;
		}
		
		return true;
	}
}
