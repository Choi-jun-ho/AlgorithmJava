package level01_10.lv10_recursion.q4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main2 {

	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		int n = 3;
		hanoi(3, 1, 2, 3);
		
		bw.close();
	}
	
	// 재귀 "과정이 아닌 반복 또는 재귀 된 것을 찾아서 실행해라"
	
	public static void hanoi(int N, int start, int via, int to) throws IOException{
		if (N == 1) {
			bw.write(start + " > " + to + "\n");
			bw.flush();
		}			
		else {
			hanoi(N-1, start, to, via);
			bw.write(start + " > " + to + "\n");
			bw.flush();
			hanoi(N-1, via, start, to);
		}
	}

}
