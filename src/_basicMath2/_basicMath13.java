package _basicMath2;
import java.io.*;
public class _basicMath13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		solution(N);

	}



	public static void solution(int N) {
		// 소수인지 확인하는 알고리즘

		boolean chk = true;

		if (N == 1) {	// N이 1인 경우 아무것도 출력하지 않는다
			return;
		}

		for(int j = 2; j < N; j++) {

			if (N % j == 0) {
				chk = false;
			}

		}

		if (chk == true) {	// N이 소수라면 자기 자신을 print
			System.out.println(N);
		} 
		else {
			for(int i = 2; i <= N; i++) {
				while(N%i == 0) {
					System.out.println(i);
					N /= i;
				}
			}
		}
	}
}