package _for;

import java.util.Scanner;

public class _for1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();

        for(int i = 1; i < 10; i++) {
            sb.append(N + " * " + i + " = ").append(N*i).append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}
