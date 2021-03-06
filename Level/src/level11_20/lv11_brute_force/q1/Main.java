package level11_20.lv11_brute_force.q1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] nCard = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < nCard.length; i++) {
			nCard[i] = Integer.parseInt(st.nextToken());
		}
		
		int big = 0;
		
		for (int i = 0; i < nCard.length-2; i++) {
			for (int j = i+1; j < nCard.length-1; j++) {
				for (int k = j+1; k < nCard.length; k++) {
					int sum = nCard[i] + nCard[j] + nCard[k];
					if (sum <= M && sum > big) {
						big = sum;
					}
				}
			}
		}
		
		bw.write(String.valueOf(big));
		bw.flush();
		bw.close();
		
	}

}

