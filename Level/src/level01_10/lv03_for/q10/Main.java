package level01_10.lv03_for.q10;

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
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (j < N-i+1) {
					bw.write(" ");
				} else {
					bw.write("*");
				}
			}
			bw.write("\n");			
		}
		
		bw.flush();
		bw.close();
		
	}

}
