package level01_10.lv05_one_dimensional_array.q4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int ipivot = 0;
		
		int[] iArr = new int[10]; 
		
		
		for (int i = 0; i < 10; i++) {
			iArr[i] = -1;
		}
		
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine())%42;
			boolean same = true;
			for (int j = 0; j <10; j++) {
				
				if (a == iArr[j]) {
					same = true;
					break;
				}				

				same = false;
			}
			if (same == false) {
				iArr[ipivot] = a;
				ipivot++;
			}
		}
		
		bw.write(ipivot + "");
		
		bw.flush();
		bw.close();
				
	}

}
