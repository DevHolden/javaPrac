package _array;
import java.util.*;



public class _array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;		// TestCase개수
		int student = 0;	// 학생 수
		int[] arr;
		
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();	// 개수 입력받음


		for (int i = 0; i < c; i++) {
			student = sc.nextInt();	// 학생수 입력
			arr = new int[student];	
			
			double sum = 0;
			
			double average = 0;
			
			for (int j = 0; j < student; j++) {
				int val = sc.nextInt();
				arr[j] = val;
				sum += arr[j];
			}
			
			average = sum / student;
			double cnt = 0;
			
			for (int j = 0; j < student; j++) {
				if(arr[j] > average) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f%%\n", (cnt/student)*100);
				
		}
		sc.close();
	}

}
