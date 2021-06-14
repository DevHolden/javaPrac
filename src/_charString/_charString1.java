package _charString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _charString1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		char ch = ' ';
		str = br.readLine();
		ch = str.charAt(0);
		int num = (int)ch;
		
		System.out.println(num);
	}

}
