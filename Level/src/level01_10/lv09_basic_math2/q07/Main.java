package level01_10.lv09_basic_math2.q07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int[] value = {w-x, h-y, x, y};
		
		int smallPivot = 0;
		
		for (int i = 1; i <= value.length-1; i ++) {
			if(value[i] < value[smallPivot]) {
				smallPivot = i;
			}
		}
		
		bw.write(String.valueOf(value[smallPivot]));
		bw.flush();
		bw.close();
		
	}
}
