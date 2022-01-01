package level01_10.lv07_String.q09;

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
			
		String[] croatiaAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		String s = br.readLine();
		
		int pivot;
		for (pivot = 0; pivot < s.length(); pivot++) {
			boolean check = false;
			
			for (int i = 0; i < croatiaAlpha.length; i++) {
				int icheck = 0;
				for(int k = 0; k < croatiaAlpha[i].length(); k++) {
					char a = croatiaAlpha[i].charAt(k);
					char b;
					if (s.length() < pivot+k+1) {
						break;
					} else {
						b = s.charAt(pivot+k);
					}
					if (a == b) {
						icheck++;
						if (icheck == croatiaAlpha[i].length()) {
							check = true;
							result++;
							pivot += croatiaAlpha[i].length()-1;
							break;
						}						
					} else {
						check = false;
						break;
					}
				}

				if (check == true) {
					break;
				}
				
			}
			
			if (check == false) {
				result++;
			}
		}
		
		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();
	}

}
