package _bruteForce;
import java.util.*;

// ���Ʈ���� : ��ġ
public class _bruteForce3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arrX = new int[N];		// ������
		int[] arrY = new int[N];		// Ű

		// �Է� �޾Ƽ� Ű, ������ �迭�� ����
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
