package a;

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
		int result = 0;
		
		boolean isMin = false;
		
		int Nmax = (int)Math.ceil(Math.sqrt(N))+100;
		
		int[] primes = new int[100];
		
		int pivot = 1;
		for (int i = 0; i < 27; i++) {
			
			for (int k = pivot+1; k <= 103; k++) {
				if (isPrimeNum(k)) {
					pivot = k;
					break;
				}
			}
			
			primes[i] = pivot;
			
		}
		
		for (int i = 0; i < primes.length-1; i++) {
			result = primes[i]*primes[i+1];
			if (result > N) {
				break;
			}
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
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
