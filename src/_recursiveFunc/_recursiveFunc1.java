package _recursiveFunc;
import java.util.*;
public class _recursiveFunc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(factorial(N));
	}
	
	public static int factorial(int N) {
		
		if(N == 0) {
			return 1;
		}
		
		else 
			return N * factorial(N-1);
		
	}
}
