package _basicMath1;
import java.util.*;

public class _basicMath3 {

	public static void main(String[] args) {	// �������� �̿�
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 1;
		int i = 1;
		int start = 1;
		int head = 1, tail = 1;	// �и�, ����

		while (true) {	// ���� ����
			if(result+i <= num) {
				result += i;
				i++;
			}
			else {
				break;
			}

		}
		
		for(int j = 1; j < i; j++) {	// �� �׷��� �����ϴ� ���� ���ϱ�
			start += j;
		}
		
		
		if (i % 2 == 1) {	// Ȧ���� ��
			head = 1;	// �и�
			tail = i;	// ����
			
			for(int j = start; j < num; j++) {
				head++;
				tail--;
			}
		}
		
		else {
			head = i;	// �и�
			tail = 1;	// ����
			
			for(int j = start; j < num; j++) {
				head--;
				tail++;
			}
		}
		
		System.out.println(tail+"/"+head);
		sc.close();

	}
}


