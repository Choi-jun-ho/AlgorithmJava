package level01_10.lv08_basic_math.q8;


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
		
		String a = st.nextToken();
		String b = st.nextToken();

		String result = "";
				
		int aLen = a.length();
		int bLen = b.length();
		
		int abLenSub = aLen-bLen;
		
		String c = "";
		
		for (int i = 0; i < Math.abs(abLenSub); i++) {
			c += "0";
		}
		
		if (aLen > bLen) {
			b = c + b;
		} else if (aLen < bLen) {
			a = c + a;
		}
						
		int count10 = 0;
		int pivot = a.length()-1;
		String returnCount = "";
				
		for (; pivot >= 0;pivot--) {
			int iA = Integer.parseInt(String.valueOf(a.charAt(pivot) ) );
			int iB = Integer.parseInt(String.valueOf(b.charAt(pivot) ) );
			
			int iABC = iA+iB+count10; 
			
			int count1 = (iABC)%10;
			
			returnCount = String.valueOf(count1);
			result = returnCount + result;
			
			count10 = (iABC)/10;
		}
		
		if (count10 > 0) {
			result = count10 + result;
		}
		
		bw.write(result);
		bw.flush();
				
		bw.close();
	}
	
}
