package b;

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
		
		for (int i = 0; i < T; i++) {
			Long N = Long.parseLong(br.readLine());
						
			if ((N % 3 == 2 || N % 9 == 0))
				bw.write("TAK\n");	
			else 
				bw.write("NIE\n");
			
			bw.flush();
		}
		
		bw.close();
	}

	
}
