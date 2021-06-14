package _charString;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _charString9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		solution(S);
	}

	public static void solution(String S) {
		int cnt = 0;

		for (int i = 0; i < S.length(); i++) {
			
			if(S.charAt(i) == 'c') {	// c=, c-일 때
				if(i < S.length() -1) {
					if(S.charAt(i+1) == '=' || S.charAt(i+1) == '-') {
						i++;
					}
				}

			}

			else if(S.charAt(i) == 'd') {
				if(i < S.length() -1) {
					if(S.charAt(i+1) == '-') { // d-일 때
						i++;
					}
					
					else if(S.charAt(i+1) == 'z') {
						if(i < S.length() -2) {
							if(S.charAt(i+2) == '=') {
								i = i+2;
							}
						}
					}
				}
				

			}

			else if(S.charAt(i) == 'l' || S.charAt(i) == 'n') {	// lj, nj 일 떄
				if(i < S.length() -1) {
					if(S.charAt(i+1) == 'j') {
						i++;
					}
				}

			}

			else if (S.charAt(i) == 's' || S.charAt(i) == 'z'){
				if(i < S.length() -1) {
					if(S.charAt(i+1) == '=') {
						i++;
					}
				}
			}
			
			cnt++;
		}
		System.out.println(cnt);
	}
}
