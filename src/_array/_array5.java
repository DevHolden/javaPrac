package _array;

import java.util.Arrays;
import java.util.Scanner;

public class _array5 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		float[] arr = new float[num];
		float ret = 0;
		float max = 0;
		

		for(int i = 0; i < arr.length; i++) {	// 점수 입력
			arr[i] = sc.nextFloat();
		}

		Arrays.sort(arr);
		
		
		max = arr[num-1];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / max * 100;
			ret += arr[i];
		}

		ret /= arr.length;

		System.out.println(ret);
	}


}
