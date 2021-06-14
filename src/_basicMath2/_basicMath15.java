package _basicMath2;

import java.util.ArrayList;
import java.util.Scanner;

public class _basicMath15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int M = sc.nextInt();
			if(M == 0) {
				break;
			}
			int N = 2*M;
			M = M+1;

			ArrayList<Boolean> primeList = new ArrayList<Boolean>(N+1);
			for(int i = 0; i < 2; i++) {	// 0 ~ 1의 수를 false로 처리
				primeList.add(i, false);
			}

			for(int i = 2; i <= N; i++) {
				primeList.add(i, true);
			}

			// 2부터 ~ i * i <= n
			// 각각의 배수들을 지워간다.
			for(int i = 2; (i*i)<=N; i++) {
				if(primeList.get(i)) {
					for(int j = i*i; j<=N; j+=i) {
						primeList.set(j, false);
					}
				}
			}

			int cnt = 0;
			for(int i = M; i <= N; i++) {
				if(primeList.get(i) == true ) {
					cnt++;
				}
				
			}
			System.out.println(cnt);
		}
		
	}

}