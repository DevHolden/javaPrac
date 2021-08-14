package _sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 정렬 : 소트인사이드
public class _sort5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();
        int[] arr = new int[N.length()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(N.charAt(i));
        }
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}
