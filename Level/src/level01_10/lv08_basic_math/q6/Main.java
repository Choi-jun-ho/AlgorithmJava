package level01_10.lv08_basic_math.q6;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int T = Integer.parseInt(br.readLine());
		
		int[][] apartment = new int[15][14];
		
		for (int i = 0; i < apartment[0].length; i++) {
			apartment[0][i] = i+1;
		}
		
		
		for (int k = 1; k < apartment.length; k++) {
			for (int n = 0; n < apartment[k].length; n++ ) {
				for (int j = 0; j <= n; j++) {
					apartment[k][n] += apartment[k-1][j];
				}
			}
		}
		
		
		for (int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(apartment[K][N-1])+"\n");
			bw.flush();
		}
		
		bw.close();
	}
	
}
