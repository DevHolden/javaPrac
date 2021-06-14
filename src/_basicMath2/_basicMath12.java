package _basicMath2;
import java.io.*;
public class _basicMath12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		solution(M, N);
	}

	public static void solution(int M, int N) {
		int min = 0;
		int sum = 0;

		for (int i = M; i < N+1; i++) {
			boolean chk = true;
			
			if (i == 1) {	// 1이면 즉시 벗어남
				continue;
			}

			for(int j = 2; j < i; j++) {

				if (i % j == 0) {
					chk = false;
				}

			}

			if (chk == true) {	// 소수일 때 이루어지는 작업
				sum += i;
				if (min == 0) {
					min = i;
				}
				
			}
		}

		if (min == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);	
		}
		
	}
}
