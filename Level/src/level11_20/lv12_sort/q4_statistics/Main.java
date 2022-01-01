package level11_20.lv12_sort.q4_statistics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Counting sort
public class Main {

	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static int[] numbers;
	public static int max = 8001;
	public static int[] count = new int[max];
	
	// 통계
    public static int arithmeticMean;	// 1. 산술평균
    public static int median;  // 2. 중앙값
    public static int modes[];	// 3. 최빈값
    public static int modePivot = 0;
    public static int scope;	// 4. 범위
	
	public static int N; // 배열의 수
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		numbers = new int[N];
		modes = new int[N];
		
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			arithmeticMean += numbers[i]; 
		}
		
		sort();
		median = numbers[(int) Math.ceil(N/2.0)-1];
		scope = numbers[N-1] - numbers[0];
		
		info();
		bw.close();
		
	}
	
	public static void sort() throws IOException {
		
		for (int i = 0; i < N; i++) {
			count[numbers[i]+4000]++;
		}
		
		
		modes[modePivot] = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[modes[0]] < count[i]) {
				for (int k = 0; k < modePivot; k++)
					modes[k] = 0;
				modes[0] = i;
				modePivot = 1;
			} else if (count[modes[0]] == count[i] && count[i] != 0) {
				modes[modePivot] = i;
				modePivot++;
			}
		}
		
		int pivot = -4000;
		for (int i = 0; i < N; i++) {
			for (int j = pivot+4000; j < max; j++) {
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
		
	public static void info() throws IOException{
		bw.write(Math.round((double)arithmeticMean/N) + "\n");
		bw.write(median + "\n");
		if (modePivot != 1)
			bw.write(modes[1]-4000 + "\n");
		else 
			bw.write(modes[0]-4000 + "\n");
		bw.write(scope + "\n");
		bw.flush();
	}

}
