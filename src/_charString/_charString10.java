package _charString;
import java.util.*;
public class _charString10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		int cnt = 0;

		for(int i = 0; i < num; i++) {
			String S = sc.next();
			if(solution(S) == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static boolean solution(String S) {
		boolean chk = true;

		for(int i = 1; i < S.length(); i++) {
			if(S.charAt(i-1) != S.charAt(i)) { // ���� ���ڰ� ���� ���ڿ� �ٸ� ��
				if(i > 1) {
					for(int j = i-2 ; j > -1; j--) {
						if(S.charAt(i) == S.charAt(j)) {	// ���ڰ� ������ �ݺ�����Ŷ��
							chk = false;
						}
					}
				}

			}
		}

		return chk;

	}
}
