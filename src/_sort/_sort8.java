package _sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 정렬 : 단어 정렬
public class _sort8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = new String[N];

        for (int i = 0; i < N; i++)
            s[i] = br.readLine();

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(s[0]).append("\n");

        for (int i = 1; i < N; i++) {
            if (!s[i].equals(s[i - 1])) {
                sb.append(s[i]).append("\n");
            }
        }


        System.out.print(sb);
    }
}
