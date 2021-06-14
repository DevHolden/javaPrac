package _basicMath1;
import java.util.*;
public class _basicMath6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(solution(k, n));
		}
	}
	public static int solution(int k, int n) {
		int ret = 0;
		if (k == 0) {
			ret = n;
		}
		else {
			for(int i = 1; i < n+1; i++) {
				ret += solution(k-1, i);
			}
		}
		
		return ret;
	}
}
