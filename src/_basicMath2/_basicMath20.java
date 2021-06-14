package _basicMath2;
import java.io.*;
public class _basicMath20 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		
		double ans1 = r*r*Math.PI;
		double ans2 = 2*r*r;
		
		System.out.println(String.format("%.6f", ans1));
		System.out.println(String.format("%.6f", ans2));
	}

}
