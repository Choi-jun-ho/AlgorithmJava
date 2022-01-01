package level11_20.lv12_Sort.q3_counting_sort;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

// 버블 정렬 ver3
public class CountingSort {

	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static Random random = new Random();
	
	public static int[] numbers;
	public static int max = 10000000;
	public static int[] count = new int[max];
	
	public static int N = 10000000; // 배열의 수
	
	public static long beforeTime = 0;
	public static long afterTime = 0;
	public static double time = 0;
	
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//N = Integer.parseInt(br.readLine());
		
		numbers = new int[N];
		
		random.setSeed(N);
		
		for (int i = 0; i < N; i++) {
			//numbers[i] = Integer.parseInt(br.readLine());
			numbers[i] = random.nextInt(max)+1;
		}
		
		beforeTime = System.currentTimeMillis();
		sort();
		afterTime = System.currentTimeMillis();
		time += afterTime - beforeTime;

		check();
		info();
		
		//printNumbers();
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
	 	
	public static void info() throws IOException {
		
		bw.write("배열의 수 : " + N + "\n");
				
		bw.write("걸린 시간 : " + time/1000.0 + "s\n");
		
		bw.flush();
	}
	
	public static void check() throws IOException {
		
		boolean checks = true;
		
		for (int i = 0; i < N-1; i++) {
			if (numbers[i] > numbers[i+1]) {
				checks = false;
			}
			if (!checks) {
				break;
			}
		}
		
		if (checks) {
			bw.write("성공!\n");
		} else {
			bw.write("실패...\n");
		}
		
		bw.flush();
		
	}

}
