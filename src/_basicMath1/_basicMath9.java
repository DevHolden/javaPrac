package _basicMath1;
import java.util.*;

public class _basicMath9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 
		int T = in.nextInt();	// �׽�Ʈ ���̽� 
		
		for(int i = 0; i < T; i++) {
        
			int X = in.nextInt();
			int Y = in.nextInt();
			
			int distance = Y - X;	// �Ÿ�
			
			int max = (int)Math.sqrt(distance);	// �Ҽ��� ����
            
			if(max == Math.sqrt(distance)) {
				System.out.println(max * 2 - 1);
			}
			else if(distance <= max * max + max) {
				System.out.println(max * 2);
			}
			else {
				System.out.println(max * 2 + 1);
			}
			
		}
	}

	
}

// https://m.blog.naver.com/PostView.nhn?isHttpsRedirect=true&blogId=geeyoming&logNo=220372803149&proxyReferer=