package _charString;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _charString3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		solution(S);

	}
	
	public static void solution(String S) {
		int[] arr = new int[26];
		
		for(int i=0; i < 26; i++) {
			arr[i] = -1;
		}
		
		
		for(int i = 0; i < S.length(); i++) {
			if(arr[(int)(S.charAt(i) - 97)] == -1) {
				arr[(int)(S.charAt(i) - 97)] = i;
			}
		}
		
		for(int i=0; i<26; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
