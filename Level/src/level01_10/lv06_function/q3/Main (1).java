package q3;

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
		
		int value = 0;
		
		for (int i = 1; i <= N; i++) {
			if (check(i)) {
				value ++;
			}
		}
		
		bw.write(value + "");
		bw.flush();
		bw.close();
		
	}
	
	public static boolean check(int a) {
		String[] sArray = ("" + a).split("");
		
		int difference;
		
		if (sArray.length <= 2) {
			return true;
		} else {
			boolean check = false;
			difference = Integer.parseInt(sArray[0]) - Integer.parseInt(sArray[1]);
			for (int i = 1; i < sArray.length-1; i++) {
				int x = Integer.parseInt(sArray[i]);
				int y = Integer.parseInt(sArray[i+1]);
				
				if ((x - y) != difference ) {
					return false;
				}
				
				if ((x - y) == difference) {
					check = true;
				}
			}
			
			return check;
		}
		
	}

}
