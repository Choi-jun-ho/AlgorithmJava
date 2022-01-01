package level01_10.lv09_basic_math2.q11;

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
		
		int T = Integer.parseInt(br.readLine());
		
		int jX, jY, jRange, bX, bY, bRange;
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			jX = Integer.parseInt(st.nextToken());
			jY = Integer.parseInt(st.nextToken());
			jRange = Integer.parseInt(st.nextToken());
			bX = Integer.parseInt(st.nextToken());
			bY = Integer.parseInt(st.nextToken());
			bRange = Integer.parseInt(st.nextToken());
			String result = "";
			
			double jbDistance = Math.sqrt(Math.pow(jX-bX, 2) + Math.pow(jY-bY, 2)); 
			int jbRange = jRange+bRange;
			
			if (jRange <= 0 || bRange <= 0) {
				result = "-1";
			} else if (jbDistance == 0 ) {
				if (jRange == bRange) {
					result = "-1";	
				} else {
					result = "0";
				}
			} else if (jbDistance >jbRange) {
				result = "0";
			} else if (jbDistance == jbRange) {
				result = "1";
			} else {
				if (jbDistance < Math.abs(jRange-bRange)) {
					result = "0";
				} else if (jbDistance == Math.abs(jRange-bRange)) {
					result = "1";
				} else {
					result = "2";
				}
			}
			
			bw.write(result+"\n");
			bw.flush();
		}
				
		bw.close();
		
	}
}
