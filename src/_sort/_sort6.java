package _sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 정렬 : 좌표 정렬하기
public class _sort6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int temp0 = 0;
        int temp1 = 0;
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            arr[i][0] =Integer.parseInt(str[0]);
            arr[i][1] =Integer.parseInt(str[1]);
        }

        // 정렬
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i + 1; j < arr.length-1; j++) {
                if(arr[i][0] > arr[j][0]) {
                    temp0 = arr[i][0];
                    temp1 = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = temp0;
                    arr[j][1] = temp1;
                }
            }

        }


        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i][0] == arr[i+1][0]) {
                if(arr[i][1] > arr[i+1][1]) {
                    temp1 = arr[i][1];
                    arr[i][1] = arr[i+1][1];
                    arr[i+1][1] = temp1;
                }
            }
        }

        //출력
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i][0] + " ");
            sb.append(arr[i][1] + "\n");
        }
        System.out.println(sb);
    }
}
