package _charString;
import java.util.*;

public class _charString7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		System.out.println(compare(solution(num1), solution(num2)));
			
		
	}

	
	public static int solution(String S) {		// 수를 뒤집는 메서드
		String arr[] = new String[S.length()];
		String str = "";
		
		for(int i = 2; i > -1; i --) {
			str += S.charAt(i);
		}
		
		return Integer.parseInt(str);
	}
	
	
	public static int compare(int num1, int num2) {	// 비교 메서드
		if (num1 > num2)
			return num1;
		
		else
			return num2;
	}
}
