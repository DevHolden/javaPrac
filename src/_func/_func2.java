package _func;
import java.util.*;
import java.util.stream.Stream;

public class _func2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] check = new boolean[10001];
		boolean fin = true;
		int j = 1;
				
	for (int i = 1; i < 10001; i++) {
		int n = d(i);
		
		if(n < 10001) {
			check[n] = true;
		}
	}
	
	for (int i = 1; i < 10001; i++) {
		if(!check[i]) {
			System.out.println(i);
		}
	}
	
		
		//Arrays.stream(arr).anyMatch(1::equals);
	}

	public static int d(int n) {
		int ret = n;
		int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
		
		for(int i = 0; i < digits.length; i++) {
			ret += digits[i];
		}
		
		return ret;
	}
	
	
}
