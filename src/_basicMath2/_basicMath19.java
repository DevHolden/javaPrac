package _basicMath2;
import java.io.*;
import java.util.StringTokenizer;
public class _basicMath19 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int r1 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			int r3 = Integer.parseInt(st.nextToken());		

			if(r1 == 0 && r2 == 0 && r3 == 0) {
				break;
			}
			
			Triangle(r1, r2, r3);

		}
	}
	
	public static void Triangle(int r1, int r2, int r3) {
		
		if(r1*r1 == (r2*r2 + r3*r3)) {
			System.out.println("right");
		}
		else if(r2*r2 == (r1*r1 + r3*r3)) {
			System.out.println("right");
		}
		else if(r3*r3 == (r2*r2 + r1*r1)) {
			System.out.println("right");
		}
		else
			System.out.println("wrong");
	}

}
