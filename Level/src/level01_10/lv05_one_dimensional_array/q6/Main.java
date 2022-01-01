package level01_10.lv05_one_dimensional_array.q6;

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
		
		
		String[] answers;
		
		
		for (int i = 0; i < T; i++) {
			String answer = br.readLine();
			answers = answer.split("");
			int score = 0;
			int count = 0;
			
			for (int j = 0; j < answers.length; j++) {
				if (answers[j].equals("O")) {
					count++;
					score += count;

				} else if (answers[j].equals("X")){
					count = 0;
				}
			}
			bw.write(score + "\n");
			bw.flush();
		}
		
		
		bw.close();
				
	}

}