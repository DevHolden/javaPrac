package _bruteForce;
import java.io.*;
import java.util.StringTokenizer;
// ���Ʈ���� : ��ȭ���� ��
public class _bruteForce5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();	// �Է� ��
		StringTokenizer st = new StringTokenizer(input);
		int N = Integer.parseInt(st.nextToken());

		int count = 0;	// 666�� ���Ե� ���ڰ� ���� �� ���� count++���� ����

		for(int i = 666; ; i ++) {
			String cmp = Integer.toString(i);	
			
			for(int j = 0; j < cmp.length()-2; j++) {
				
				char first = cmp.charAt(j);	// ù��° �� ����
				char second = cmp.charAt(j+1);	// �ι�° �� ����
				char third = cmp.charAt(j+2);	// ����° �� ����
				
				if((first == '6') && (first == second) && (second == third))   {	// 6�� ���� ���� �ݺ��ȴٸ�
					count++;
					break;
				}
			}			
			if(count == N) {	// count�� N�� �������� �ش� ��°�� �� ��� �� break;
				System.out.println(i);
				break;
			}

		}
		


	}

}
