package level01_10.lv07_String.q03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] string = br.readLine().split("");
		int[] alphabet = new int[26]; 
		
		for (int i = 0; i < alphabet.length; i++) 
			alphabet[i] = -1;
		// 97 ~ 122
		for (int i = 0; i < string.length; i++) {
			for (int c = 97; c <= 122; c++) {
				if ((int)string[i].charAt(0) == c && alphabet[c-97] == -1){
					alphabet[c-97] = i;
				}
			}
			
		}
		
		for (int i = 0; i < alphabet.length; i++) {
			bw.write(alphabet[i] + " ");
		}
		bw.flush();
		bw.close();
	}

}
