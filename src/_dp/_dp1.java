package _dp;

import java.util.Scanner;

public class _dp1 {
    static int[] dp0;
    static int[] dp1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        dp0 = new int[41];
        dp1 = new int[41];

        for(int i = 0 ; i < 41; i++) {
            fibonacci0(i);
            fibonacci1(i);
        }

        for(int i = 0; i< T; i++) {
            int N = sc.nextInt();

            System.out.print(dp0[N] + " " + dp1[N]);
            System.out.println();
        }

    }

    static int fibonacci0(int N) {
        if(dp0[N] != 0) {
            return dp0[N];
        }

        if(N == 0) {
            return dp0[0] = 1;
        } else if (N == 1) {
            return dp0[1] = 0;
        } else {
            if(fibonacci0(N-1) != 0 && fibonacci0(N-2) != 0) {
                return dp0[N] = dp0[N-1] + dp0[N-2];
            } else {
                return dp0[N] = fibonacci0(N-1) + fibonacci0(N-2);
            }
        }
    }

    static int fibonacci1(int N) {
        if(dp1[N] != 0) {
            return dp1[N];
        }

        if(N == 0) {
            return dp1[0] = 0;
        } else if (N == 1) {
            dp1[1] = 1;
            return dp1[1];
        } else {
            if(dp1[N-1] != 0 && dp1[N-2] != 0) {
                return dp1[N] = dp1[N-1] + dp1[N-2];
            } else {
                return dp1[N] = fibonacci1(N-1) + fibonacci1(N-2);
            }
        }
    }
}
