package _basicMath2;

import java.util.ArrayList;
import java.util.Scanner;

// �������� ����
public class _basicMath16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();	// testcase

		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();
			solution(N);
		}


	}

	public static void solution(int N) {
		ArrayList<Boolean> primeList = new ArrayList<Boolean>(N+1);
		for(int i = 0; i < 2; i++) {	// 0 ~ 1�� ���� false�� ó��
			primeList.add(i, false);
		}

		for(int i = 2; i <= N; i++) {
			primeList.add(i, true);
		}

		// 2���� ~ i * i <= n
		// ������ ������� ��������.
		for(int i = 2; (i*i)<=N; i++) {
			if(primeList.get(i)) {
				for(int j = i*i; j<=N; j+=i) {
					primeList.set(j, false);
				}
			}
		}

		int cnt = 0;

		for(int i = 0; i <= N; i++) {
			if(primeList.get(i) == true ) {
				cnt++;
			}

		}
		int[] pN = new int[cnt];

		int k = 0;
		
		// �ش��ϴ� ���� ���� �Ҽ����� pN�̶�� ��Ŀ� ����.
		for(int i = 0; i <= N; i++) {
			if(primeList.get(i) == true ) {
				pN[k] = i;
				k++;
			}

		}

		
		// �Ҽ��� ������ ���
		int num1 = 0;
		int num2 = 0;
		int temp1 = 0;
		int temp2 = 0;
		int plus = 0;
		int tempPlus = 10000;

		for(int i = 0; i < pN.length; i++) {
			for (int j = 0; j < pN.length; j++) {
				if (pN[i] + pN[j] == N) {
					if (pN[i] <= pN[j]) {
						temp1 = pN[i];
						temp2 = pN[j];
						tempPlus = temp1 + temp2;
						if (tempPlus < plus) {
							plus = tempPlus;
							num1 = temp1;
							num2 = temp2;
						}
					}
				}
			}
		}
		
		System.out.println(temp1 + " " + temp2);

	}

}
