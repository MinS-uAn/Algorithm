import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int count = 1;
		
		int e = 1;
		int s = 1;
		int m = 1;
		
		if(E==1 && S==1 && M==1) {
			System.out.println(1);
		}
		else {
			while(E!=e || S!=s || M!=m) {
				count++; e++; s++; m++;
				if(e>15)
					e=1;
				if(s>28)
					s=1;
				if(m>19)
					m=1;
			}
			System.out.println(count);
		}
	}
}