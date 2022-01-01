package level01_10.lv08_basic_math.q7;


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
		
		int X = 0;
		int Y = 0; // x = 5kg y = 3kg
		
		boolean check = false;
		
		int result = 0;
		
		for (int i = 0; i <= N; i++) {
			check = false;
			Y = i;
			X = (-3*Y + N)/5;
			if ( (5*X + 3*Y -N) == 0 && X >= 0) {
				check = true;
				break;
			}
		}
		
		if (check) {
			result = (int)X+Y;
		} else {
			result = -1;
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
				
		bw.close();
	}
	
}
