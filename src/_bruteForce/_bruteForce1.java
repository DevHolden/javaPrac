package _bruteForce;
import java.util.*;

// ���Ʈ���� : ����
public class _bruteForce1 {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		// ī���� ����
		int M = sc.nextInt();	// ���� ���ƾ��� ��
		int[] card = new int[N];
		
		for(int i = 0; i < N; i++) {	// ī�� ���ڸ� �Է¹���.
			card[i] = sc.nextInt();
		}
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(j == i) {
					continue;
				}
				for(int k = 0; k < N; k++) {
					if(k == i || k == j) {
						continue;
					}
					if(card[i] + card[j] + card[k] <= M && card[i] + card[j] + card[k] > sum) {
						sum = card[i] + card[j] + card[k];
					}
				}
			}
		}
		
		System.out.println(sum);
	}

}
