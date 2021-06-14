package _basicMath2;
import java.util.*;
public class _basicMath11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		
		for(int i = 0; i < N; i++) {
			boolean chk = true;
			int num = sc.nextInt();
			
			if (num == 1) {
				continue;
			}
			
			for(int j = 2; j < num; j++) {
				
				if (num % j == 0) {
					chk = false;
				}
				
			}

			if (chk == true) {
				cnt++;
			}
			
			
		}
		System.out.println(cnt);
		sc.close();
		

	}
	
}
