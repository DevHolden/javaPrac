package _basicMath2;
import java.util.*;
public class _basicMath14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

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


		for(int i = 0; i <= N; i++) {
			if(primeList.get(i) == true ) {
				if(i >= M)
					System.out.println(i);
			}
		}

	}


}
