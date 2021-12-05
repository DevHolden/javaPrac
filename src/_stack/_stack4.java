package _stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _stack4 {
    private static Stack<Character> s;
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = new Stack<>();
        sb = new StringBuilder();

        while(true) {
            s.clear();
            String str = br.readLine();
            if(str.equals(".")) {
                break;
            }
            isValid(str);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void isValid(String str) {
        for(int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            switch(ch) {
                case '(' :
                    s.push(ch);
                    break;

                case '{' :
                    s.push(ch);
                    break;

                case '[' :
                    s.push(ch);
                    break;

                case ')' :
                    if(s.size() == 0 || s.peek() != '(') {
                        sb.append("no");
                        return;
                    } else {
                        s.pop();
                    }
                    break;

                case '}' :
                    if(s.size() == 0 || s.peek() != '{') {
                        sb.append("no");
                        return;
                    } else {
                        s.pop();
                    }
                    break;

                case ']' :
                    if(s.size() == 0 || s.peek() != '[') {
                        sb.append("no");
                        return;
                    } else {
                        s.pop();
                    }
                    break;

                default :
                    break;
            }
        }

        if(s.empty()) {
            sb.append("yes");
        } else {
            sb.append("no");
        }
    }
}
