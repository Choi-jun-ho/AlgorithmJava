package level01_10.lv08_basic_math.q3;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		
		int layer = check(T);
		
		int result = layer - (max(layer) - T);
		int result2 = (max(layer) - T) + 1;
		
		String s;
		
		if (layer % 2 == 0) {
			s = result + "/" + result2;
		} else {
			s = result2 + "/" + result;
		}
		
		
		bw.write(s);
		bw.flush();
		bw.close();
	}
	
	public static int check(int T) {
		int a = (int)(1+Math.sqrt(8*T-7) )/2;
		return a;
	}

	public static int max(int n) {
		return n*(n+1)/2;
	}
}
