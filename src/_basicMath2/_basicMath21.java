package _basicMath2;
import java.util.*;
public class _basicMath21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			turret(x1, y1, r1, x2, y2, r2);
		}
	}
	
	public static void turret(int x1, int y1, int r1, int x2, int y2, int r2) {		
		
		if(x1==x2 && y1==y2 && r1 == r2) {	// �� ���� ��ġ�� ���
			System.out.println(-1);
		}
		else {
			double d = 0;
			
			if(x1==0 && x2==0) {	// �� �� ������ �Ÿ� ���ϱ�
				d = Math.abs(y1-y2);
			} 
			else if(y1==0 && y2==0){
				d = Math.abs(x1-x2);
			}
			else {
				d = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
				d = Math.sqrt(d);
			}
			
			
			if(Math.abs(r1-r2) < d && d < (r1+r2)) {	// �� ������ ������
				System.out.println(2);
			}
			
			else if((r1+r2) == d) {	// �� ������ ������ : ����
				System.out.println(1);
			}
			
			else if(Math.abs(r1-r2) == d) {	// �� ������ ������ : ����
				System.out.println(1);
			}
			else if(r1 + r2 < d) {	// �� ���� �������� ������ �ʴ� ��� : �ܺο� �ִ�
				System.out.println(0);
			}
			
			else if(d < Math.abs(r1-r2)) {	// �� ���� �������� ������ �ʴ� ��� : ���ο� �ִ�
				System.out.println(0);
			}
			
			else if(d == 0) {	// ���ɿ��� ��� : �� ���� �߽��� ���� �������� �ٸ� ���
				System.out.println(0);
			}
			
		}
		
		
	}
}
