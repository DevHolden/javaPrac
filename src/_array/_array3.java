package _array;
import java.io.*;

public class _array3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c = 0;
		int num0 = 0, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0, num9 = 0;

		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		int intValue = a * b * c;

		String strValue = String.valueOf(intValue);		// str Çüº¯È¯

		String[] arr = strValue.split("");

		for(int i = 0; i < arr.length; i++) {
			switch(arr[i]) {
			case "0" : 
				num0 += 1;
				break;
				
			
			case "1" : 
				num1 = num1 + 1;
				break;

			case "2" : 
				num2 = num2 + 1;
				break;

			case "3" : 
				num3 = num3 + 1;
				break;

			case "4" : 
				num4 = num4 + 1;
				break;

			case "5" : 
				num5 = num5 + 1;
				break;

			case "6" : 
				num6 = num6 + 1;
				break;

			case "7" : 
				num7 = num7 + 1;
				break;

			case "8" : 
				num8 = num8 + 1;
				break;

			case "9" : 
				num9 = num9 + 1;
				break;	
			}
		}
		System.out.println(num0);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);

	}

}
