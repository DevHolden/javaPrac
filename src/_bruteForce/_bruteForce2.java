package _bruteForce;
import java.io.*;
// ���Ʈ���� : ������
public class _bruteForce2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strN = br.readLine();

		int N = Integer.parseInt(strN);
		int i = 1;
		boolean chk = true;
		int val = 0;
		
		while(chk) {
			val = Solution(strN, i);
			
			if(val != 0)  {
				System.out.println(val);
				chk = false;
			} else {
				i++;
			}

			if(i > N) {
				System.out.println(0);
				chk = false;
			}
		}

	}
	// @ strN : ������ ��		num : ���������� �׽�Ʈ �� �� 
	public static int Solution(String strN, int num) {

		int N = Integer.parseInt(strN);	// ������ ��


		int[] arr = new int[(int)Math.log10(num)+1];	// ������ �׽�Ʈ �� ������ �ڸ���
		boolean chk = true;	//	while���� Ż�� ������ ���� �ӽ� ����
		int idx = 0;		// arr �迭�� index
		int sum = num;	// ������
		int tmp = num;

		if((int)Math.log10(num)+1 == 1) {
			sum = num*2;
		}
		else {
			while (chk) {
				arr[idx] = num%10;
				num = num / 10;
				idx++;
				if(num == 0) {
					chk = false;
				}
			}		
			num = tmp;

			for(int i = 0;  i < arr.length; i++) {
				sum = sum + arr[i];
			}
		}

		if(sum == N) {
			return num;
		}

		else {
			return 0;
		}
	}
}
