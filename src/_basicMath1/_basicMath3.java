package _basicMath1;
import java.util.*;

public class _basicMath3 {

	public static void main(String[] args) {	// 계차수열 이용
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 1;
		int i = 1;
		int start = 1;
		int head = 1, tail = 1;	// 분모, 분자

		while (true) {	// 계차 수열
			if(result+i <= num) {
				result += i;
				i++;
			}
			else {
				break;
			}

		}
		
		for(int j = 1; j < i; j++) {	// 각 그룹의 시작하는 숫자 구하기
			start += j;
		}
		
		
		if (i % 2 == 1) {	// 홀수일 때
			head = 1;	// 분모
			tail = i;	// 분자
			
			for(int j = start; j < num; j++) {
				head++;
				tail--;
			}
		}
		
		else {
			head = i;	// 분모
			tail = 1;	// 분자
			
			for(int j = start; j < num; j++) {
				head--;
				tail++;
			}
		}
		
		System.out.println(tail+"/"+head);
		sc.close();

	}
}


