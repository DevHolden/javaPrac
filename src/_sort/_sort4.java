package _sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 정렬 : 통계학
public class _sort4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        // 입력
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        //배열 정렬
        Arrays.sort(arr);

        sb.append(avgValue(arr) + "\n"); // 산술평균
        sb.append(centerValue(arr) + "\n"); // 중앙값
        sb.append(freqVal(arr) + "\n");
        sb.append(rangeVal(arr));
        System.out.println(sb);
    }

    // 산술평균
    private static String avgValue(int[] inputArr) {
        double retVal = 0;
        for (int i = 0; i < inputArr.length; i++) {
            retVal += inputArr[i];
        }

        retVal /= inputArr.length;
        return String.format("%.0f", retVal);
    }

    // 중앙값
    private static int centerValue(int[] inputArr) {

        int centVal = inputArr.length / 2;

        return inputArr[centVal];
    }

    //최빈값
    private static int freqVal(int[] inputArr) {
        int[] cntArr = new int[8001];   // 입력받는 정수의 범위 -4000 ~ 4000
        boolean chk = false;    // 중복되는 개수가 한개인지 여러개인지 체크 true : 처음 등장, false : 빈도가 같은 경우가 다시 등장
        int freq_max = 0;
        int freq = 0;

        // 빈도수에 따라 count
        for (int i = 0; i < inputArr.length; i++) {
            cntArr[inputArr[i] + 4000]++;
        }

        for (int i = 0; i < 8001; i++) {
            if (cntArr[i] > 0) {
                if (cntArr[i] > freq_max) {
                    freq_max = cntArr[i];
                    freq = i-4000;
                    chk = true;
                }
                else if (freq_max == cntArr[i] && chk == true) {
                    freq = i-4000;
                    chk = false;
                }
            }

        }

        return freq;

    }

    // 범위값
    private static int rangeVal(int[] inputArr) {

        int retVal = inputArr[inputArr.length - 1] - inputArr[0];

        return retVal;
    }

}
