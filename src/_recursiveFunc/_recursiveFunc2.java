package _recursiveFunc;
import java.util.*;
public class _recursiveFunc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fibonacci(N));
		
	}
	
	public static int fibonacci(int N) {
		if(N == 0) {
			return 0;
		}
		else if (N == 1) {
			return 1;
		}
		else if (N == 2) {
			return 1;
		}
		else {
			return fibonacci(N-1) + fibonacci(N-2);
		}
	}
}
