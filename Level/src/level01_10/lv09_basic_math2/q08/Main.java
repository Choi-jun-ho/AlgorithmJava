package level01_10.lv09_basic_math2.q08;

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
		String result;
		
		int resultX = 0, resultY = 0;
		
		int[] x = new int[3];
		int[] y = new int[3];
		
		
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < 2; i++) {
			if (x[i] == x[i+1]) {
				resultX = x[3-i-i-1];
			}
			
			if (y[i] == y[i+1]) {
				resultY = y[3-i-i-1];	
			}

		}
		
		if (resultX == 0) {
			resultX = x[1];
		}
		
		if (resultY == 0) {
			resultY = y[1];
		}
		
		result = resultX + " " + resultY;		
		
		bw.write(result);
		bw.flush();
		bw.close();
		
	}
}
