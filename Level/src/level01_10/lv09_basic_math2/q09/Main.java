package level01_10.lv09_basic_math2.q09;

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
		
		double[] triangle = new double[3];
		
		String result;
		
		while (true) {
			st = new StringTokenizer(br.readLine());

			double a = Double.parseDouble(st.nextToken());
			triangle[0] = a;
			
			for (int i = 1; i < 3; i++) {
				a = Double.parseDouble(st.nextToken());
				if (triangle[i-1] > a) {
					triangle[i] = triangle[i-1];
					triangle[i-1] = a;
				} else {
					triangle[i] = a;
				}
			}
			
			if (triangle[0] > triangle[1]) {
				double temp = triangle[0];
				triangle[0] = triangle[1];
				triangle[1] = temp;
			}
			
			if (triangle[2] == 0)
				break;
			
			if (triangle[0]*triangle[0]+triangle[1]*triangle[1] == triangle[2]*triangle[2]) {
				result = "right\n";
			} else {
				result = "wrong\n";
			}
			
			bw.write(result);
			bw.flush();
		}
		
		bw.close();
		
	}
}
