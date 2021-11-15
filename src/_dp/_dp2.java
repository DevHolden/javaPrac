package _dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _dp2 {
    static int[][][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean chk = true;

        dp = new int[21][21][21];   // 문제에서 input이 20을 넘어가면 w(20,20,20)으로 처리하기에 배열의 크기를 21로 설정
        while(chk) {
            String input = br.readLine();
            if(input.equals("-1 -1 -1")){
                break;
            }
            String[] inputStr = input.split(" ");

            int[] inputInt = new int[3];
            inputInt[0] = Integer.parseInt(inputStr[0]);
            inputInt[1] = Integer.parseInt(inputStr[1]);
            inputInt[2] = Integer.parseInt(inputStr[2]);

            System.out.println("w(" + inputInt[0] + ", " + inputInt[1] + ", "+ inputInt[2] +") = " + w(inputInt[0], inputInt[1], inputInt[2]));
        }
    }
    static int w(int a, int b, int c) {
        if(inputRange(a, b, c)) {
            if(dp[a][b][c] != 0) {
                return dp[a][b][c];
            }
        }

        if(a <=0 || b <= 0 || c <= 0) {
            return 1;
        } else if (a > 20 || b > 20 || c > 20) {
            return dp[20][20][20] = w(20, 20, 20);
        } else if (a < b && b < c) {
            return dp[a][b][c] = w(a, b, c-1) +w(a, b-1, c-1) - w(a, b-1, c);
        } else {
            return  dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
        }
    }
    // input이 0<= a,b,c <= 20의 범위 내에 있으면 true 반환
    static boolean inputRange(int a, int b, int c) {
        if(0<=a && a<=20 && 0<=b && b<=20 && 0<=c && c<=20) {
            return true;
        } else {
            return false;
        }
    }
}
