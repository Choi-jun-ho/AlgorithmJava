package level11_20.lv12_Sort.q3_counting_sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

// Counting sort
public class Main {

	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static Random random = new Random();
	
	public static int[] numbers;
	public static int max = 10000;
	public static int[] count = new int[max];
	
	public static int N; // 배열의 수
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		numbers = new int[N];
		
		random.setSeed(N);
		
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		sort();
		
		printNumbers();
		bw.close();
		
	}
	
	public static void sort() throws IOException {
		
		for (int i = 0; i < N; i++) {
			count[numbers[i]-1]++;
		}
		
		int pivot = 1;
		for (int i = 0; i < N; i++) {
			for (int j = pivot-1; j < max; j++) {
				if(count[j] > 0) {
					numbers[i] = pivot;
					count[j]--;
					break;
				} else if (count[j] <= 0){
					pivot++;
				}
			}
		}
		
	}
	
	public static void printNumbers() throws IOException {
		
		for (int i = 0; i < N; i++) { 
			bw.write(String.valueOf(numbers[i]) + "\n"); 
		}
		
		bw.flush();
	}
}
