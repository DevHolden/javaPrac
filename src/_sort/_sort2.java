package _sort;
import java.util.*;

// ���� : �� �����ϱ�2
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
		
		// Timsort (�־��� ��쿡�� �ð� ���⵵�� nlogn��, Array.sort()�� nlogn������ �־��� ��� n^2�� �ð����⵵�� ���´�)
		Collections.sort(list);
		
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
			
		
		System.out.println(sb);
	}
	

}
