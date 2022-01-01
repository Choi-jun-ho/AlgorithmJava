package level11_20.lv12_Sort.q2_nlogn;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

// ���� ��������  
public class Main {

	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static Random random = new Random();
	
	public static int[] numbers;
	
	public static int N = 100000; // �迭�� ��
	
	public static int T = 1; // ����� ���ϱ� ���� �ݺ� Ƚ�� 
	
	public static long compareN = 0; // �� Ƚ��
	public static long exchangeN = 0; // ��ȯ Ƚ��
	
	public static long beforeTime = 0;
	public static long afterTime = 0;
	public static double time = 0;
	
	public static void main(String[] args) throws IOException {
		//N = Integer.parseInt(br.readLine());
		
		numbers = new int[N];
		
		for (int t = 1; t <= T; t++) {
			random.setSeed(N);
			
			for (int i = 0; i < N; i++) {
				//numbers[i] = Integer.parseInt(br.readLine());
				numbers[i] = random.nextInt(N+1);
			}
			
			beforeTime = System.currentTimeMillis();
			sort();
			afterTime = System.currentTimeMillis();
			time += afterTime - beforeTime;
		}
				
		check();
		info();
		bw.close();
	
	}
	
	public static void sort() {
		for (int i = 0; i < (N+1)/2; i++) {
			int bigPivot = i;
			int smallPivot = i;
			for (int k = i+1; k < N-i; k++) {
				compareN++;
				if (numbers[k] >= numbers[bigPivot]) {
					bigPivot = k;
				}
				compareN++;
				if (numbers[k] <= numbers[smallPivot]) {
					smallPivot = k;
				}
			}
			compareN++;
			if (bigPivot == i && smallPivot == N-i-1) {
				compareN+=2;
				swapNumbers(bigPivot, smallPivot);
			} else {
				swapNumbers(bigPivot, N-i-1);
				compareN++;
				if (smallPivot == N-i-1) {
					smallPivot = bigPivot;
				}
				swapNumbers(smallPivot, i);				
			}
			
		}
	}
	
	public static void swapNumbers(int a, int b) {
		int temp = numbers[a];
		numbers[a] = numbers[b];
		numbers[b] = temp;
		exchangeN++;
	}
	
	public static void info() throws IOException {
		
		bw.write("�迭�� �� : " + N + "\n");

		if (T > 1) 
			bw.write("�ݺ� Ƚ�� : " + T + "\n");
		
		bw.write("�ɸ� �ð� : " + time/T/1000.0 + "s\n");
		bw.write("�� Ƚ�� : " + compareN/T + "\n");
		bw.write("��ȯ Ƚ�� : " + exchangeN/T + "\n");
		
		bw.flush();
	}
	
	public static void printNumbers() throws IOException {
				
		for (int i = 0; i < N; i++) { 
			bw.write(String.valueOf(numbers[i]) + " "); 
			if (i % 1000 == 0) { 
				bw.write("\n"); 
			} 
		}
		bw.write("\n");
		
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
			bw.write("����!\n");
		} else {
			bw.write("����...\n");
		}
		
		bw.flush();
		
		
	}

}
