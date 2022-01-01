package level01_10.lv04_while.q2_eof;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int a = -1;
		int b = -1;
		int result;
		
		String input = "";
		while ( ( input = br.readLine() ) != null) {
			st = new StringTokenizer(input);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			result = a + b;
			bw.write(result + "\n");
			bw.flush();
		
		}
		
		bw.close();
		
	}

}
