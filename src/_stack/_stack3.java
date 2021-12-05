package _stack;

import java.util.Scanner;
import java.util.Stack;

public class _stack3 {
    private static Stack<Character> s;
    private static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        int T = sc.nextInt();
        s = new Stack<>();

        // input
        for(int i = 0; i < T; i++) {
            s.clear();
            String str = sc.next();

            chkVps(str);
            sb.append("\n");
        }
        System.out.println(sb);
    }



    private static void chkVps(String str) {
        // 입력 String의 길이가 홀수이면 바로 Return
        if((str.length() % 2) == 1) {
            sb.append("NO");
            return;
        }

        for(int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            switch (ch) {
                case '(' :
                    s.push(str.charAt(j));    // 열린 괄호는 스택에 push
                    break;
                case ')' :
                    if(s.size() == 0) { // EmptyStack 에러 방지
                        sb.append("NO");
                        return;
                    }
                    if(s.peek() == '(') {   // 스택에 저장되어있는 ( pop
                        s.pop();
                    }
                    break;
                default :
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
        if(s.empty() == true) {
            sb.append("YES");
        } else {
            sb.append("NO");
        }
    }
}
