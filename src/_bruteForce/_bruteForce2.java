package _bruteForce;
import java.io.*;
// 브루트포스 : 분해합
public class _bruteForce2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strN = br.readLine();

		int N = Integer.parseInt(strN);
		int i = 1;
		boolean chk = true;
		int val = 0;
		
		while(chk) {
			val = Solution(strN, i);
			
			if(val != 0)  {
				System.out.println(val);
				chk = false;
			} else {
				i++;
			}

			if(i > N) {
				System.out.println(0);
				chk = false;
			}
		}

	}
	// @ strN : 분해합 수		num : 생성자인지 테스트 할 수 
	public static int Solution(String strN, int num) {

		int N = Integer.parseInt(strN);	// 분해합 수


		int[] arr = new int[(int)Math.log10(num)+1];	// 생성자 테스트 할 숫자의 자리수
		boolean chk = true;	//	while문의 탈출 조건을 위한 임시 변수
		int idx = 0;		// arr 배열의 index
		int sum = num;	// 분해합
		int tmp = num;

		if((int)Math.log10(num)+1 == 1) {
			sum = num*2;
		}
		else {
			while (chk) {
				arr[idx] = num%10;
				num = num / 10;
				idx++;
				if(num == 0) {
					chk = false;
				}
			}		
			num = tmp;

			for(int i = 0;  i < arr.length; i++) {
				sum = sum + arr[i];
			}
		}

		if(sum == N) {
			return num;
		}

		else {
			return 0;
		}
	}
}
