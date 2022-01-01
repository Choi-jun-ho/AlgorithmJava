package level11_20.lv11_brute_force.q3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int N;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		int spec[][] = new int[N][2];
		int rank[] = new int[N];
		
		for(int i=0; i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			spec[i][0] = Integer.parseInt(st.nextToken());
			spec[i][1] = Integer.parseInt(st.nextToken());
			rank[i]=1;
		}
		
		for(int i=0;i<N;i++) {
			for(int j = 0;j<N;j++) {
				
				if(spec[i][0]>spec[j][0]&&spec[i][1]>spec[j][1])
					rank[j]++;	
			}
		}
			
		
		for(int i=0;i<N;i++)
			bw.write(String.valueOf(rank[i]) + " ");
		
		bw.flush();
		bw.close();
		
	}
}