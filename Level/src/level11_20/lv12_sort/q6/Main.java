package level11_20.lv12_sort.q6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static int[][] location;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		location = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			location[i][0] = Integer.parseInt(st.nextToken());
			location[i][1] = Integer.parseInt(st.nextToken());
		}
		
		sort(0, 0, N); // x 기준으로 sort
		
		sortY(); // y 기준으로 sort
		
		printLocationArray();
		
		bw.close();
		
	}
	
	public static void sort(int xy, int a, int b) {

		int h = 1;
		while (h < (b-a)/9) {
			h = h * 3 + 1;
		}
		
		while (h >0) {
			for (int i = h; i < b; i++) {
				int j = i - h;
				int[] tmp = location[i];
				while (j >= a && location[j][xy] > tmp[xy]) {
					location[j+h] = location[j];
					j -= h;
				}
				location[j+h] = tmp;
			}
			h /= 3;
		}
		
	}
	
	public static void sortY() {
		
		int[][] xNumbers = xNumbersToLocationArray();
				
		int sortPivot = 0;
		
		for (int i = 0; i < xNumbers.length; i++) {
			
			if (xNumbers[i][1] > 1)
			{
				int k = sortPivot;
				
				sort(1, k, k+xNumbers[i][1]);
			}
			
			sortPivot += xNumbers[i][1];
		}
		
	}
	
	public static int[][] xNumbersToLocationArray( ) {
		
		int N = 1;
		for (int i = 0; i < location.length-1; i++) {
			if (location[i] != location[i+1]) {
				N++;
			}
		}

		int xPivot = location[0][0];
		int pivot = 0;
		
		int[][] xNumberArray = new int[N][2];
		
		xNumberArray[pivot][0] = xPivot;  // x의 값
		xNumberArray[pivot][1] = 0;       // x의 개수
		
		for (int i = 0; i < location.length; i++) {
			if (location[i][0] != xPivot) {
				xPivot = location[i][0];
				
				pivot++;
				xNumberArray[pivot][0] = xPivot;
				xNumberArray[pivot][1] = 1;
				
			} else {
				xNumberArray[pivot][1]++;
			}
		}
		
		return xNumberArray;
	}
	
	public static void printLocationArray() throws IOException{
		
		for (int i = 0; i < location.length; i++) {
			bw.write(String.valueOf(location[i][0]));
			bw.write(" ");
			bw.write(String.valueOf(location[i][1]));
			bw.write("\n");
		}
		bw.flush();
	}

}
