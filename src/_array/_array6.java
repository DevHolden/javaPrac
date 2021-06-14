package _array;
import java.io.*;

public class _array6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int score = 0;
		int tmp = 0;

		num = Integer.parseInt(br.readLine());
		String[] arr = new String[num];

		for(int i = 0; i < num; i++) {	// 테스트케이스 입력
			arr[i] = br.readLine();
		}

		for(int i = 0; i < num; i++) {
			for(int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					tmp += 1;
					score += tmp;
				}

				else if (arr[i].charAt(j) == 'X') {
					tmp = 0;

				}
			}
			System.out.println(score);
			score = 0;
			tmp = 0;
		}
		
	}

}

