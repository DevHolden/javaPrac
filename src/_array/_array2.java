package _array;

import java.io.*;

public class _array2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[9];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int maxValue = arr[0];
		int maxIndex = 0;
		
		for(int j = 0; j < arr.length; j++) {
			if (arr[j] > maxValue) {
				maxValue = arr[j];
				maxIndex = j;
			}
		}
		System.out.println(maxValue);
		System.out.println(maxIndex+1);

	}
}