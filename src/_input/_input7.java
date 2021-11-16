package _input;

import java.util.Scanner;

public class _input7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextInt();
        double n2 = sc.nextInt();

        System.out.println(n1 / n2);
        
        sc.close();
    }
}