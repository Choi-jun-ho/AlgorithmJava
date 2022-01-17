package level11_20.lv12_sort.qlast;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[] locations = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++)
			locations[i] = Integer.parseInt(st.nextToken());	
		
		printCompressionLocatons(locations);		
		bw.close();
	}
	
	public static void printCompressionLocatons(int[] locations) throws IOException {

		int[] locationsCopy = Arrays.copyOf(locations, locations.length);
		
		LinkedList<Integer> rank = new LinkedList<Integer>();
		
		Arrays.sort(locationsCopy);
				
		for (int i = 0; i < locationsCopy.length; i++) {
			if (i != 0 && locationsCopy[i] == locationsCopy[i-1])
				continue;
			rank.add(locationsCopy[i]);
		}
		
		Integer[] ranks = rank.toArray(new Integer[rank.size()]);
						
		for(int i = 0; i < locations.length; i++) {
			
			bw.write(String.valueOf(Arrays.binarySearch(ranks, locations[i])));
			
			bw.write(" ");
		}
		
		bw.flush();
	}
	
}
