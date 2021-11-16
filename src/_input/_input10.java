package _input;

import java.util.Scanner;

public class _input10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        String tmp = sc.next();
        int n2 = Integer.parseInt(tmp);
        int[] m = new int[tmp.length()];

        for(int i = 0; i < tmp.length(); i++) {
            char n = tmp.charAt(i);
            m[i] = Character.getNumericValue(n);
        }
        for(int j = m.length-1; j >= 0; j--) {
            System.out.println(n1 * m[j]);
        }
        System.out.println(n1 * n2);
    }
}
