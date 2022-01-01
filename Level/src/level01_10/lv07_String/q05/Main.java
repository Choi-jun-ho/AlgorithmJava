package level01_10.lv07_String.q05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String string = br.readLine().toUpperCase();
		
		int[] alphabet = new int[26];
		
		for (int i = 0; i < string.length(); i++) {
			for (int c = 65; c <= 90; c++) {
				if (string.charAt(i) == c) {
					alphabet[c-65] += 1;
				}
			}
			
		}
		
		int big = 0;
		String rc = "!"; // resultChar		
		
		for (int i = 0; i < alphabet.length; i ++) {
			if (big < alphabet[i]) {
				big = alphabet[i];
				rc = String.valueOf((char) (i+65));		
			} else if (big == alphabet[i]) {
				rc = "?";
			}
		}
				
		bw.write(rc);
		
		bw.flush();
		bw.close();
	}

}
