package level11_20.lv12_sort.q9;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		Member[] members = new Member[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			members[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		
		Arrays.sort(members, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o1.age-o2.age;
			}
		});	
		
		
		
		printWords(members);
		bw.close();
	}
	
	public static class Member {
		
		int num;		
		int age;
		String name;
		
		public Member(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return age + " " + name;
		}
		
	}
	
	public static void printWords(Member[] members) throws IOException{
		
		for(int i = 0; i < members.length; i++) {
			
			bw.write(members[i].toString());
			bw.write("\n");
		}
		
		bw.flush();
		
	}

}
