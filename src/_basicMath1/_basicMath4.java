package _basicMath1;
import java.io.*;
public class _basicMath4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] str = input.split(" ");
		int[] arr = new int[str.length];
		
		int A = Integer.parseInt(str[0]);	//	���� �ö󰡴� ����
		int B = Integer.parseInt(str[1]);	//	�㿡 �������� �Ÿ�
		int V = Integer.parseInt(str[2]);	//	������ ����
				
		int i = 0;
		int now = 0;	// ���� �������� ����
		
		if(A>B) {
			i = (int) Math.ceil((double)(V-B) / (A-B));
		}
		else {
			i = V / (A-B);
		}
		
		System.out.println(i);
	}

}
