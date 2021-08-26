package _sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 정렬 : 나이순 정렬
public class _sort9 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            arr[i][0] = str[0];
            arr[i][1] = str[1];
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(Integer.parseInt(o1[0]) < Integer.parseInt(o2[0])) {
                    return -1;
                } else if (Integer.parseInt(o1[0]) > Integer.parseInt(o2[0])){
                    return 1;
                } else {
                    return 0;
                }

            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}