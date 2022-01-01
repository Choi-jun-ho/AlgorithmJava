package level11_20.lv12_sort.q5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	public static int[] numbers;
	public static int max = 9+1;
	public static int[] count = new int[max];
	
	public static int N; // 배열의 수
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] numberString = br.readLine().split("");
		N = numberString.length;
		
		numbers = new int[N];
				
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(numberString[i]);
		}
		
		sort();
		
		printNumbers();
		bw.close();
		
	}
	
	public static void sort() throws IOException {
		
		for (int i = 0; i < N; i++) {
			count[numbers[i]]++;
		}
		
		int pivot = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = pivot; j < max; j++) {
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
		
		for (int i = N-1; i >= 0; i--) { 
			bw.write(String.valueOf(numbers[i])); 
		}
		
		bw.flush();
	}

}
