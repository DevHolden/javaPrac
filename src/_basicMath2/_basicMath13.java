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
		// �Ҽ����� Ȯ���ϴ� �˰���

		boolean chk = true;

		if (N == 1) {	// N�� 1�� ��� �ƹ��͵� ������� �ʴ´�
			return;
		}

		for(int j = 2; j < N; j++) {

			if (N % j == 0) {
				chk = false;
			}

		}

		if (chk == true) {	// N�� �Ҽ���� �ڱ� �ڽ��� print
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