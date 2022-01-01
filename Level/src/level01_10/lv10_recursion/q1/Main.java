package level01_10.lv10_recursion.q1;

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
		bw.write(String.valueOf(factorial(N)));
		
		bw.flush();
		bw.close();
	}
	
	public static int factorial(int n) {
		int result = n;
		if (n == 0)
			return 1;
		else if (n > 1)
			result *= factorial(n-1);
		
		return result;
	}

}
