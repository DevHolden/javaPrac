package _basicMath1;
import java.util.*;

public class _basicMath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 2;
		int i = 1;
		
		while (true) {
			if(result <= num) {
				result += 6*i;
				i++;
			}
			else {
				break;
			}

		}
		System.out.println(i);
		sc.close();
		
	}

}
