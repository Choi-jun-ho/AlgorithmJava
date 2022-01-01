package level01_10.lv10_recursion.q4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int N = Integer.parseInt(br.readLine());
		int N = 3;
		bw.write(String.valueOf((1<<N)-1) + "\n");
		bw.flush();
		hanoi(N, 1, 2, 3);
		
		
		bw.close();
	}
	
	
	public static void hanoi(int N, int start, int via, int to) throws IOException{
		if (N == 1) {
			bw.write(start + " " + to + "\n");
			bw.flush();
		} else {
			hanoi(N-1, start, to, via);
			bw.write(start + " " + to + "\n");
			bw.flush();
			hanoi(N-1, via, start, to);
		}
	}

}
