package level01_10.lv07_String.q08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int result = 0;
			
		String[] dial = {"", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

		String[] s = br.readLine().split("");
		
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < dial.length; j++) {
				for (int k = 0; k < dial[j].length(); k++) {
					if(s[i].equals(String.valueOf(dial[j].charAt(k)))) {
						result += j+2;
					}
				}
			}
		}
		

		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();
	}

}
