package _bruteForce;

import java.util.*;
// ���Ʈ���� : ��ȭ���� ��
public class _bruteForce5 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		char[][] inputArr = new char[M][N];
		char[] arr = new char[M*N];	// 2���� �迭�� 1���� �迭�� �Ű���

		for (int i = 0; i < N; i++) {
			String str = sc.next();	// �� �� �Է¹���.
			for (int j = 0; j < M; j++) {
				inputArr[i][j] = str.charAt(j);	// �� �� ���� 2���� �迭 inputArr�� �Է�.
			}
		}
		
		
	}

}
