package _sort;

import java.util.*;

// 정렬 : 좌표압축
public class _sort10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();   // input의 개수
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {    // input
             arr[i] = sc.nextInt();
        }
        int[] tmp = arr.clone();
        Arrays.sort(arr); // 정렬
        HashMap<Integer, Integer> hm = new HashMap<>();

        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if(!hm.containsKey(arr[i])) {
                hm.put(arr[i], cnt++);
            }
        }

        for(int i = 0; i < arr.length; i++) {
            sb.append(hm.get(tmp[i])).append(" ");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
