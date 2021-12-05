package _stack;

import java.util.ArrayList;
import java.io.*;

public class _stack1 {
    static ArrayList<Integer> stack = new ArrayList();

    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean chk = true;
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int idx = 0;
            String input = br.readLine();
            if(input.contains(" ")) {
                String s = input.split(" ")[1];
                input = input.split(" ")[0];
                idx = Integer.parseInt(s);
            }

            switch(input) {
                case "push" : push(idx); break;
                case "pop" : sb.append(pop()).append("\n"); break;
                case "top" : sb.append(top()).append("\n"); break;
                case "empty" : sb.append(empty()).append("\n"); break;
                case "size" : sb.append(size()).append("\n"); break;
                default: System.out.println("잘못된 값을 입력하였습니다"); break;
            }
        }
        System.out.println(sb);
    }
    // stack의 Size Return
    public static int size() {
        int size = stack.size();

        return size;
    }
    // push
    public static void push(int n) {
        stack.add(n);
    }
    // pop
    public static int pop() {
        int size = size();

        if(size == 0) {
            return -1;
        }
        int p = stack.remove(size-1);

        return p;
    }
    // 스택이 비어있는지 확인, 비어있을 시 1, 아니면 0 리턴
    public static int empty() {
        if(size() == 0) {
            return 1;
        } else {
            return 0;
        }
    }
    // 스택의 제일 위의 값 리턴 (비어있을 시 -1 리턴)
    public static int top() {
        int ret = 0;

        if(empty() == 1) {  // 비어있을 때
            ret = -1;
        } else {
            ret = stack.get(size()-1);
        }
        return ret;
    }
}
