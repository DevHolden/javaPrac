package _while;

import java.util.Scanner;

public class _while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int retVal = n;
        int cnt=0;

        do {
            n=func(n);
            cnt++;
        } while(n != retVal);

        System.out.println(cnt);
        sc.close();
    }
    static int func(int n) {
        if(n < 10) {
            String str = Integer.toString(n);
            str = str + str;
            n = Integer.parseInt(str);

            return n;
        } else {
            int a = n/10;
            int b = n%10;
            int tmp = a+b;
            if(tmp >= 10) {
                int c = tmp%10;
                n = b*10 + c;
            } else {
                n = b*10 + tmp;
            }

            return n;
        }
    }
}
