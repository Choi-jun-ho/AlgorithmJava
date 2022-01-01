package level01_10.lv09_basic_math2.q06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			
			String result = "";
			
			for (int k = n/2; k < n; k++) {
				if (isPrimeNum(k) && isPrimeNum(n-k)) {
					
					result = (n-k) + " " + k; 
					break;
				}
			}			
			
			bw.write(result + "\n");
			bw.flush();			
		}
		
		
		bw.close();
		
	}
	
	public static boolean isPrimeNum(int num) {
				
		if (num == 1) {
			return false;
		}
		
		for (int i = 2; i <= (int)Math.sqrt(num); i++) {

			if (num % i == 0)
				return false;
		}
		
		return true;
	}
}
