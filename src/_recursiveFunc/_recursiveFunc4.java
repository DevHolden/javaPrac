// �ϳ��� ž �̵� ����

package _recursiveFunc;
import java.util.*;



public class _recursiveFunc4 {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// �Է� ��(������ ����)
		int N = sc.nextInt();
		
		sb.append((int) (Math.pow(2, N) -1)).append('\n'); 
		
		hanoi(N, 1, 2, 3);
		System.out.println(sb);
	}

	public static void hanoi(int N, int start, int mid, int to) {


		if(N == 1) {
			sb.append(start + "  " + to + "\n");
			return;
		}
		// STEP 1 : N-1���� A���� B�� �̵�
		hanoi(N-1, start, to, mid);

		// STEP 2 : 1���� A���� C�� �̵�
		sb.append(start + " " + to + "\n");

		// STEP 3 : N-1���� B���� C�� �̵�
		hanoi(N-1, mid, start, to);
	}



}
