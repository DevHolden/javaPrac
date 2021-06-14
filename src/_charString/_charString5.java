package _charString;
import java.util.*;

public class _charString5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		solution(S);
		
	}

	public static void solution(String S) {
		int[] arr = new int[26];
		
		
		for (int i = 0; i < 26; i++) {
			arr[i] = 0;
		}
		
		
		
		for (int i = 0; i < S.length(); i++) {
			int tmp = (int)(S.charAt(i));
			
			if ((int)(S.charAt(i)) > 96 && (int)(S.charAt(i)) < 123 ) {	// �ҹ��ڶ��
				tmp = (int)(S.charAt(i)) - 32;
				
			}
			
			arr[tmp-65] += 1;
			
		}
		
		int max = arr[0];
		int maxIndex = 0;
		boolean sameVal = false;
		
		for (int i = 0; i < 26; i++) {	// ���� ���� ���� ���ĺ��� ã��
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		
		}
		
		for (int i = 0; i < 26; i++) {
			if(i != maxIndex && max == arr[i]) {
				sameVal = true;
			}
		}
		
		if (!sameVal) {
			System.out.println((char)(maxIndex+65));
		} else {
			System.out.println("?");
		}
		
	}
}
