package _charString;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _charString2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum = 0;
		int[] arr = new int[str.length()];
		
		for(int i = 0; i < num; i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
			sum += arr[i];
		}
		
		System.out.println(sum);
	}

}
