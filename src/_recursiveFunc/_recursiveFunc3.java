// @https://st-lab.tistory.com/95 참고

package _recursiveFunc;
import java.util.*;
public class _recursiveFunc3 {
	static char[][] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		arr = new char[N][N];
		
		makeStar(0, 0, N, false);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}

	public static void makeStar(int x, int y, int N, boolean blank) {
		
		if(blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
		/*
		  N=27일 경우 한 블록의 사이즈는 9이고,
		  N=9일 경우 한 블록의 사이즈는 3이듯
		  해당블록의 한 칸을 담을 변수를 의미하는 size
		 
		  count는 별 출력 누적을 의미
		 */
		
		int size = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) {
					makeStar(i, j, size, true);
				} else {
					makeStar(i, j, size, false);
				}
			}
		}
	}
}
