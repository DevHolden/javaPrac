package _bruteForce;
import java.util.*;

// 브루트포스 : 덩치
public class _bruteForce3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arrX = new int[N];		// 몸무게
		int[] arrY = new int[N];		// 키

		// 입력 받아서 키, 몸무게 배열에 저장
		for(int i = 0; i < N; i ++) {
			arrX[i] = sc.nextInt();
			arrY[i] = sc.nextInt();
		}


		for(int i = 0; i < N; i ++) {
			int k = 0;
			for(int j = 0; j < N; j++) {
				if (j == i) {
					continue;
				}
				else {
					if((arrX[i] < arrX[j]) && (arrY[i] < arrY[j])) {
						k++;
					}
				}
			}
			System.out.println(k+1);
		}
	}

}
