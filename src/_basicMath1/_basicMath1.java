package _basicMath1;
import java.util.Scanner;
public class _basicMath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		solution(A, B, C);
	}

	public static void solution(int A, int B, int C) {
		

		if(B < C) {
			System.out.println(A/(C-B) + 1);
			
		}
		else {	// ���ͺб����� �������� ���� ��
			System.out.println(-1);
		}



		// ���ͺб����� �������� �������� �����ؾ���.


	}
}
