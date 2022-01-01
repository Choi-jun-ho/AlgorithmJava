package level01_10.lv09_basic_math2.q02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int result = 0;
		int min = 0;
		
		for (int i = M; i <= N; i++) {
			if (isPrimeNum(i)) {
				if (min == 0) 
					min = i;
				result += i;
			}
		}
		
		if (min == 0) {
			bw.write("-1");
		} else {
			bw.write(String.valueOf(result) + "\n" + String.valueOf(min));
		}		
		
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
