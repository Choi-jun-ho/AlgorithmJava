package q2_selfnumber;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
		
	public static void main (String[] args) throws IOException{
		
		selfNumber(notD_n_());
		
	}
	
	public static int d(int n) {
		String s = n + "";
		String[] sArr = s.split("");
		int result = n;
		for (int i = 0; i < sArr.length; i++) {
			result += Integer.parseInt(sArr[i]);
		}
		return result; 
	}
	
	public static int[] notD_n_() {
		int T = 10000;
		int[] results = new int[T+1];
		int result = 0;
		
		for (int i = 0; i <= T; i++) {

			result = d(i);
			
			if (result <= T) {
				results[result] = result;
			} 
			
			if (results[i] == 0) {
				results[i] = -1;
			}
		}
				
		return results;		
	}
	
	public static void selfNumber(int[] notD_n_Array) throws IOException{

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 1; i < notD_n_Array.length; i++) {
			if (notD_n_Array[i] != i) {
				bw.write(i + "\n");
			}
		}
		
		bw.flush();
		bw.close();
	}
}
