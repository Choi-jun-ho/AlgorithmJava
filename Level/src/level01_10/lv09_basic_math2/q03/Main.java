package level01_10.lv09_basic_math2.q03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int N = Integer.parseInt(br.readLine());
		
		int save = N;
		
		boolean max = false;
		boolean run = true;
		
		if (isPrimeNum(save)) {
			bw.write(String.valueOf(save)+"\n");
			bw.flush();
			run = false;
		}
		
		if (save == 1) {
			run = false;
		}
		
		while (run) {
						
			for(int i = 2; i < N; i++) {
				if ( save % i == 0) {
					save /= i;
					bw.write(String.valueOf(i)+"\n");
					bw.flush();
					break;
				}
				
				if (i == N-1) {
					max = true;
				}
			}
			
			if (max == true) {
				break;
			}
			
		}
		
		
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
