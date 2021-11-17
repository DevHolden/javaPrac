package _for;

import java.io.*;

public class _for10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            for( int j = N-i; j>=1; j--) {
                wr.write(" ");
            }
            for(int j = 1; j <= i; j++) {
                wr.write("*");
            }
            wr.write("\n");
        }
        wr.flush();
        br.close();
    }
}