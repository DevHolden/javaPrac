package _basicMath2;
import java.io.*;
import java.util.StringTokenizer;
public class _basicMath17 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String strX = st.nextToken(" ");
		String strY = st.nextToken(" ");
		String strW = st.nextToken(" ");
		String strH = st.nextToken(" ");
		
		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);
		int w = Integer.parseInt(strW);
		int h = Integer.parseInt(strH);
		
		int[] arr = new int[4];
		arr[0] = x;
		arr[1] = y;
		arr[2] = w-x;
		arr[3] = h-y;
		
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(min);
	}

}
