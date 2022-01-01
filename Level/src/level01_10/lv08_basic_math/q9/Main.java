package level01_10.lv08_basic_math.q9;


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
		
		StringTokenizer st = null;
		
		int T = Integer.parseInt(br.readLine());
		double x, y;
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			double xyDiff = Math.abs(x-y);
			int result = 0;
			double n = Math.floor((-1 + Math.sqrt(1+8*(xyDiff/2)))/2);
			result += n*2;
			
			double remainder = (double)xyDiff-n*(n+1);
		
			double a = Math.ceil(remainder/(n+1)*1.0);
			result += a;
			
			bw.write(String.valueOf(result)+"\n");
			bw.flush();
		}
						
		bw.close();
	}
	
}
