package level01_10.lv05_one_dimensional_array.q7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		
		
		String[] nScore;
		
		for (int j = 0; j < T; j++) {
			String answer = br.readLine();
			
			nScore = answer.split(" ");
			
			int N = Integer.parseInt(nScore[0]);
			int[] score = new int[N];
			
			int sum = 0;
			
			for (int i = 0; i < N; i++) {
				score[i] = Integer.parseInt(nScore[i+1]);
				sum += score[i];
			}
			
			double avarage = (double)sum/N;
			
			int avarageCut = 0;
			
			for (int i = 0; i < N; i++) {
				if (score[i] > avarage) 
					avarageCut++;
			}
			
			double avarageCutting = (double)avarageCut/N*100.0;
			
			bw.write(String.format("%.3f", avarageCutting) + "%\n");
			bw.flush();
		}
		
		
		
		bw.close();
				
	}

}