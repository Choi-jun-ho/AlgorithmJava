package level01_10.lv10_recursion.q3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] s = new String[N][N];
		
		for (int y = 0; y < s.length; y++) {
			for (int x = 0; x < s[y].length; x++) {
				s[y][x] = "*";
			}
		} 

		s= tileWork(s, 3, N);
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				bw.write(s[i][j]);
			}
		}
		
 		bw.flush();
		bw.close();
	}
	
	public static String[][] tileWork(String[][] tile, int n, int max) {
		
		String[][] s = tile;
		
		String[][] tileset = starTile(tile, n);
		
		if (max == 1) {
			return s;
		}
		
		
				
		for (int y = 0; y < tile.length; y++) {
			
			for (int x = 0; x < tile[y].length; x++) {
								
				s[y][x] = tileset[y%n][x%n];
				
			}
			if (s[y][s[y].length-1].length() == 1)
				s[y][s[y].length-1] += '\n';
		}
		
		if (n >= max) {
			return s;
		}
		
		if (n*3 <= max)
			tileWork(s, n*3, max);
		return s;
	}
	
	public static String[][] starTile(String[][] star, int n) {
		
		String[][] s = star; 
				
		int div = n/3;
		
		if (n <= 1) {
			return s;
		}
				
		for (int y = 0; y < s.length; y++) {
			for (int x = 0; x < s[y].length; x++) {
				if ((x+1 > div && x+1 <= div*2) && (y+1 > div && y+1 <= div*2)) {
					s[y][x] = " ";
				}
			}
		}
				
		return s;
	}

}
