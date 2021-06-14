package _charString;
import java.util.*;
public class _charString4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	// 테스트케이스 개수
		
		
		for(int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			System.out.println(solution(R, S));
		}
		
		
		
	}
	
	public static String solution(int R, String S) {
		
		String ret = "";
		
		for(int i = 0; i < S.length(); i++) {
			for(int j = 0; j < R; j++) {
				ret = ret + S.charAt(i);
			}
		}
		
		return ret;
	}
}
