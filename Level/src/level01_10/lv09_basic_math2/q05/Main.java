package level01_10.lv09_basic_math2.q05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n;
		
		while (true) {
			n = Integer.parseInt(br.readLine());
			
			int result = 0;
			
			if (n == 0)
				break;
			
			for (int i = n+1; i <= n*2; i++) {
				if(isPrimeNum(i))
					result++;
			}
			
			bw.write(String.valueOf(result) + "\n");
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
