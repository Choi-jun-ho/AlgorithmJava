package level01_10.lv09_basic_math2.q10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int r = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(r*r*Math.PI) + "\n");
		bw.write(String.valueOf(r*2*r));
		bw.flush();		
		bw.close();
		
	}
}
