// https://m.blog.naver.com/ka28/221850826909
// BufferedReader = scanner;
// BufferedWriter = System.out.println;
// StringTokenizer = scanner.nextLine(); 
  // 정확하게는 bufferedReader.readLine()으로 생성자를 호출해서
  // stringTokenizer.nextToken()으로 " " 공백을 기준으로 가져오는 객체

package level01_10.lv03_for.q04_buffered_Reader_Writer_StringTokenizer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		
		int T = Integer.parseInt(bf.readLine());
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(bf.readLine());
			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
		}
		
		//bw.flush(); // 남아있는 데이터를 출력시킨다
		bw.close(); // 스트림을 닫는다
		
	}

}
