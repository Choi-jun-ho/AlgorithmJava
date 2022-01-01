package level11_20.lv11_brute_force.q4;

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
		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char [][] Tile = new char[N][M];
		char [][] bwTile = setbwTile();
				
		for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			for (int k = 0; k < M; k++) {
				Tile[i][k] = temp.charAt(k);
			}
		}
				
		int min = 2501;
		
		for (int i = 0; i <= Tile.length-8; i++) {
			for (int k = 0; k <= Tile[i].length-8; k++) {
				int bwCount = 0;
				int wbCount = 0;
				
				for (int y = 0; y < 8; y++) {
					for (int x = 0; x < 8; x++) {
						if (Tile[i+y][k+x] != bwTile[y][x]) {
							bwCount++;
						}
						if (Tile[i+y][k+x] == bwTile[y][x]) {
							wbCount++;
						}
					}
				}
				
				if (bwCount < min) {
					min = bwCount;
				}
				if (wbCount < min) {
					min = wbCount;
				}
			}
		}
		
		if (N >= 8 && M >= 8 && N <= 50 && M <= 50)
			bw.write(String.valueOf(min) + "\n");
		
		bw.flush();
		bw.close();
	}
	
	public static char[][] setbwTile() {
		
		char[] pivot = {'B', 'W'};
		
		char[][] bwTile = new char[8][8];
		
		for (int i = 0; i < 8; i++) {
			for (int k = 0; k < 8; k++) {
				if (k % 2 == 0) {
					bwTile[i][k] = pivot[0];
				} else {
					bwTile[i][k] = pivot[1];
				}
			}
			char temp = pivot[0];
			pivot[0] = pivot[1];
			pivot[1] = temp;
		}
		
		return bwTile;
	}
	
}
