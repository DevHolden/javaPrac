package _func;
import java.io.*;


public class _func3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		num = Integer.parseInt(br.readLine());
		int cnt = 0;
		boolean[] check = new boolean[num+1];
		check[0] = false;
		
		for(int i = 1; i < num+1; i++) {
			check[i] = solution(i);
		}
		
		for(int i = 1; i < num+1; i++) {
			if(check[i] == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static boolean solution(int n) {
		int tmp = 0;
		int val = n;
		int cnt = 0; // 자릿수를 담는 변수
		int j = 0;

		while(true) {	// 자릿수 구하기
			n /= 10;
			cnt++;
			if(n <= 0) {
				break;
			}
		}
		n = val;
		
		if(cnt == 1)
			return true;
		
		if(cnt == 2)
			return true;
		
		int[] arr = new int[cnt];	// 각 자릿수를 담는 배열
		
		while(n > 0) {
			tmp = n % 10;
			arr[j] = tmp;
			j++;
			n /= 10;
		}
		
		j = 0;
		n = val;
		while(j+2 < cnt) {
			if((arr[j+1] - arr[j]) != (arr[j+2] - arr[j+1]))
				return false;
			j++;
		}
		return true;
	}
}
