package _while;

import java.io.*;
import java.util.StringTokenizer;

public class _while1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean chk = true;
        StringBuilder sb = new StringBuilder();

        while(chk) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0) {
                break;
            }
            int sum = a+b;

            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
