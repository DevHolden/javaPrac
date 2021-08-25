package _sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 정렬 : 좌표 정렬하기2
public class _sort7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            arr[i][1] = Integer.parseInt(str[0]);
            arr[i][0] = Integer.parseInt(str[1]);
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        for(int i = 0; i < N; i++) {
            sb.append(arr[i][1] + " " + arr[i][0]).append('\n');
        }

        System.out.println(sb);
    }
}