package _charString;
import java.io.*;

public class _charString6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();
		S = S.trim();	// 앞 뒤의 공백 제거

		String arr[] = S.split(" ");
		int cnt = 0;

		for (String s : arr) {

			cnt++;

		}
		System.out.print(cnt);		
	}
}
