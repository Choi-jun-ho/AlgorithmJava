package level01_10.lv08_basic_math.q2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long result = 0;
		
		long N = Integer.parseInt(br.readLine());
				
		if (N > 1) 
			result = (long)( 9 + Math.sqrt(12*N-15) )/6;
		else if (N == 1)
			result = 1;

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}

}
