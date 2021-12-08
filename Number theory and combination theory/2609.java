import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		System.out.println(gcm(max,min));
		System.out.print(lcm(max,min));
		
	}
	//최대공약수
	static int gcm(int a, int b) {
		int c;
		while(b!=0) {
			c = a%b;
			a=b;
			b=c;
		}
		return a;
	}
	
	//최소공배수
	static int lcm(int a, int b) {
		return (a*b)/gcm(a,b);
	}
}