package _bruteForce;
import java.io.*;
import java.util.StringTokenizer;
// 브루트포스 : 영화감독 숌
public class _bruteForce5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();	// 입력 값
		StringTokenizer st = new StringTokenizer(input);
		int N = Integer.parseInt(st.nextToken());

		int count = 0;	// 666이 포함된 숫자가 나올 때 마다 count++해줄 변수

		for(int i = 666; ; i ++) {
			String cmp = Integer.toString(i);	
			
			for(int j = 0; j < cmp.length()-2; j++) {
				
				char first = cmp.charAt(j);	// 첫번째 비교 문자
				char second = cmp.charAt(j+1);	// 두번째 비교 문자
				char third = cmp.charAt(j+2);	// 세번째 비교 문자
				
				if((first == '6') && (first == second) && (second == third))   {	// 6이 세번 연속 반복된다면
					count++;
					break;
				}
			}			
			if(count == N) {	// count가 N과 같아지면 해당 번째의 수 출력 후 break;
				System.out.println(i);
				break;
			}

		}
		


	}

}
