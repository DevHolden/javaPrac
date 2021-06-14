package _basicMath1;
import java.util.*;
public class _basicMath5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	// TestCase 수

		for(int i = 0; i < T; i++) {
			int H = sc.nextInt();	// 층
			int W = sc.nextInt();	// 넓이
			int N = sc.nextInt();	// 문제
			solution(H, W, N);
			
			if(1 > H || W > 99 || N < 1 || N > H*W) {
				System.out.println("잘못된 입력입니다.");
			}
		}


		sc.close();

	}

	public static void solution(int H, int W, int N) {
		int hTmp = 1;	// retH를 구하는 과정에서 임시로 담아둘 H
		
		int retH = 0;	// 실제 출력될 H
		int retW = 0;	// 실제 출력될 W

		if(N % H == 0) {
			retH = H * 100;
			retW = N / H;
		} else {
			retH = (N % H) * 100;
			retW = (N / H) +1;
		}
		
		int ret = retH + retW;
		
		System.out.println(ret);
		
	}
}
