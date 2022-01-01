package level01_10.lv07_String.q04;

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
		
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String[] string = st.nextToken().split("");
			
			for (int i = 0; i < string.length; i++) {
				for (int j = 0; j < R; j++) {
					bw.write(string[i]);
				}		
			}
			bw.write("\n");
			bw.flush();
		}
		
		bw.close();
	}

}
