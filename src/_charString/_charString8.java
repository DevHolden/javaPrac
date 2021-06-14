package _charString;
import java.io.*;
public class _charString8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(solution(str));
	}

	public static int solution(String S) {
		int tmp = 0;
		int sum = 0;

		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'A' || S.charAt(i) == 'B' || S.charAt(i) == 'C') {
				tmp = 3;
			}
			else if (S.charAt(i) == 'D' || S.charAt(i) == 'E' || S.charAt(i) == 'F') {
				tmp = 4;
			}
			
			else if (S.charAt(i) == 'G' || S.charAt(i) == 'H' || S.charAt(i) == 'I') {
				tmp = 5;
			}
			else if (S.charAt(i) == 'J' || S.charAt(i) == 'K' || S.charAt(i) == 'L') {
				tmp = 6;
			}
			else if (S.charAt(i) == 'M' || S.charAt(i) == 'N' || S.charAt(i) == 'O') {
				tmp = 7;
			}
			else if (S.charAt(i) == 'P' || S.charAt(i) == 'Q' || S.charAt(i) == 'R' || S.charAt(i) == 'S') {
				tmp = 8;
			}
			else if (S.charAt(i) == 'T' || S.charAt(i) == 'U' || S.charAt(i) == 'V' ) {
				tmp = 9;
			}
			else {
				tmp = 10;
			}
			
			sum += tmp;
			
		}
		return sum;
	}

}
