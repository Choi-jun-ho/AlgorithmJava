package level11_20.lv12_sort.q2_n1_25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 버블 정렬 ver3
public class Main {

	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static int[] numbers;
	
	public static int N; // 배열의 수
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		numbers = new int[N];
		
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		sort();

		printNumbers();
		bw.close();
		
	}
	
	public static void sort() throws IOException {
		
		int h = 1;
		while (h < N/9) {
			h = h * 3 + 1;
		}
		
		while (h >0) {
			for (int i = h; i < N; i++) {
				int j = i - h;
				int tmp = numbers[i];
				while (j >= 0 && numbers[j] > tmp) {
					numbers[j+h] = numbers[j];
					j -= h;
				}
				numbers[j+h] = tmp;
			}
			h /= 3;
		}
		
	}
	
	public static void printNumbers() throws IOException {
		
		for (int i = 0; i < N; i++) { 
			bw.write(String.valueOf(numbers[i]) + "\n"); 
		}
		
		bw.flush();
	}

}
