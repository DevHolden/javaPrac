package _for;

import java.io.*;

public class _for5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}