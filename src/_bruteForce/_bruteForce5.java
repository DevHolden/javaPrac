package _bruteForce;

import java.util.*;
// 브루트포스 : 영화감독 숌
public class _bruteForce5 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		char[][] inputArr = new char[M][N];
		char[] arr = new char[M*N];	// 2차원 배열을 1차원 배열로 옮겨줌

		for (int i = 0; i < N; i++) {
			String str = sc.next();	// 한 줄 입력받음.
			for (int j = 0; j < M; j++) {
				inputArr[i][j] = str.charAt(j);	// 한 줄 마다 2차원 배열 inputArr에 입력.
			}
		}
		
		
	}

}
