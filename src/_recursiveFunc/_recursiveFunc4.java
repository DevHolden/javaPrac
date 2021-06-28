// 하노이 탑 이동 순서

package _recursiveFunc;
import java.util.*;



public class _recursiveFunc4 {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 입력 값(원판의 개수)
		int N = sc.nextInt();
		
		sb.append((int) (Math.pow(2, N) -1)).append('\n'); 
		
		hanoi(N, 1, 2, 3);
		System.out.println(sb);
	}

	public static void hanoi(int N, int start, int mid, int to) {


		if(N == 1) {
			sb.append(start + "  " + to + "\n");
			return;
		}
		// STEP 1 : N-1개를 A에서 B로 이동
		hanoi(N-1, start, to, mid);

		// STEP 2 : 1개를 A에서 C로 이동
		sb.append(start + " " + to + "\n");

		// STEP 3 : N-1개를 B에서 C로 이동
		hanoi(N-1, mid, start, to);
	}



}
