package _for;

import java.io.*;
import java.util.StringTokenizer;

public class _for7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum =  a+b;
            bw.write("Case #"+i +": "+sum+ "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
