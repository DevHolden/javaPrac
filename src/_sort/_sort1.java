package _sort;
import java.util.*;

// 정렬 : 수 정렬하기
public class _sort1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();;	// 입력의 개수
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			int M = sc.nextInt();
			arr[i] = M;
			}
		
		int tmp = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j ++) {
				if(i != j) {
					if(arr[i] < arr[j]) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
