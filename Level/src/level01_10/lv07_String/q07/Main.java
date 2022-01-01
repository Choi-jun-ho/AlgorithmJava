package level01_10.lv07_String.q07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuffer sb;
		
		sb = new StringBuffer(st.nextToken());
		int A = Integer.parseInt(sb.reverse().toString()); 
		sb = new StringBuffer(st.nextToken());
		int B = Integer.parseInt(sb.reverse().toString());

		int result = (A > B) ? A : B;

		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();
	}

}
