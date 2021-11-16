package _input;

import java.util.Scanner;

public class _input8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        calc(n1, n2);
        sc.close();
    }

    static void calc(int n1, int n2) {
        StringBuilder sb = new StringBuilder();

        sb.append(n1 + n2).append("\n");
        sb.append(n1 - n2).append("\n");
        sb.append(n1 * n2).append("\n");
        sb.append(n1 / n2).append("\n");
        sb.append(n1 % n2).append("\n");

        System.out.println(sb);
    }
}
