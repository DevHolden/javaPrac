package _if;

import java.util.Scanner;

public class _if5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n1 = sc.nextInt(); // 시
        int n2 = sc.nextInt(); // 분

        if(n2 < 45) {
            n2 = 60-45+n2;

            if(n1 == 0) {
                n1 = 23;
            } else {
                n1--;
            }
        } else {
            n2 -= 45;
        }
        sb.append(n1).append(" ").append(n2);

        System.out.println(sb);
        sc.close();
    }
}