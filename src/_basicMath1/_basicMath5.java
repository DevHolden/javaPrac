package _basicMath1;
import java.util.*;
public class _basicMath5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	// TestCase ��

		for(int i = 0; i < T; i++) {
			int H = sc.nextInt();	// ��
			int W = sc.nextInt();	// ����
			int N = sc.nextInt();	// ����
			solution(H, W, N);
			
			if(1 > H || W > 99 || N < 1 || N > H*W) {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}


		sc.close();

	}

	public static void solution(int H, int W, int N) {
		int hTmp = 1;	// retH�� ���ϴ� �������� �ӽ÷� ��Ƶ� H
		
		int retH = 0;	// ���� ��µ� H
		int retW = 0;	// ���� ��µ� W

		if(N % H == 0) {
			retH = H * 100;
			retW = N / H;
		} else {
			retH = (N % H) * 100;
			retW = (N / H) +1;
		}
		
		int ret = retH + retW;
		
		System.out.println(ret);
		
	}
}
