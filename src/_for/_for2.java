package _for;

import java.util.Scanner;

public class _for2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }

    }

}