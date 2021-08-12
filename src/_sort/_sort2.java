package _sort;
import java.util.*;

// 정렬 : 수 정렬하기2
public class _sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		
		// Timsort (최악의 경우에도 시간 복잡도가 nlogn임, Array.sort()는 nlogn이지만 최악의 경우 n^2의 시간복잡도를 갖는다)
		Collections.sort(list);
		
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
			
		
		System.out.println(sb);
	}
	

}
