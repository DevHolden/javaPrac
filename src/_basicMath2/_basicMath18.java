package _basicMath2;
import java.util.*;
public class _basicMath18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = 0, y = 0;
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		if(x1 == x2) {
			x = x3;
		}
		else if (x1 == x3) {
			x = x2;
		}
		else if (x2 == x3){
			x = x1;
		}
		
		if(y1 == y2) {
			y = y3;
		}
		else if (y1 == y3) {
			y = y2;
		}
		else if (y2 == y3){
			y = y1;
		}
		System.out.println(x + " " + y);
	}
	

}
