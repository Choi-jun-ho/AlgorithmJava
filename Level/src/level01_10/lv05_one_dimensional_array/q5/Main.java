package level01_10.lv05_one_dimensional_array.q5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		
		double average;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		double [] score = new double[N]; 
		double big = 0;
		double sum = 0;
		
		for (int i = 0; i < N; i++) {
			score[i] = Double.parseDouble(st.nextToken());
			if (score[i] > big) {
				big = score[i];
			}
		}
		
		for (int i = 0; i < N; i++) {
			score[i] = score[i]/big*100.0;
			sum += score[i];
		}
		
		average = sum/N;
		
		
		bw.write(average + "");
		
		bw.flush();
		bw.close();
				
	}

}
