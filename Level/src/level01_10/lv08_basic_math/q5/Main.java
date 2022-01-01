package level01_10.lv08_basic_math.q5;


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
		
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int floor = N%H;
			
			if (floor == 0) {
				floor = H;
			}
			
			int w = (int)Math.ceil((double)N/H);
			
			String s;
			
			if (w <= 9) {
				s = floor + "0" + w;
			} else {
				s = floor + "" + w;
			}
			
			bw.write(s+"\n");
			bw.flush();
		}
		
		bw.close();
	}
}
