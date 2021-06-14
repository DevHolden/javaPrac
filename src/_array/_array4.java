package _array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _array4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int num = 0;
		int count = 0;
		
		HashSet<String> hashSet = new HashSet<>();
		
		for(int i = 0; i < 10; i++) {		// 나머지 저장
			num = Integer.parseInt(br.readLine());
			arr[i] = num % 42;
		}
		
		for (int i = 0; i < 10; i++) {
			hashSet.add(Integer.toString(arr[i]));
		}
		
		for (String item : hashSet) {
			count++;
		}
		
		System.out.println(count);
	}

}
