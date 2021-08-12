package _bruteForce;
import java.io.*;

//���Ʈ���� : ü���� �ٽ� ĥ�ϱ�
public class _bruteForce4 {
 // ���ľ��� �κ��� ���ؼ� ī��Ʈ�ϱ� ���� ���� ü���� ���� ��� ����
 static final String[][] caseA = {
         {"W", "B", "W", "B", "W", "B", "W", "B"},
         {"B", "W", "B", "W", "B", "W", "B", "W"},
         {"W", "B", "W", "B", "W", "B", "W", "B"},
         {"B", "W", "B", "W", "B", "W", "B", "W"},
         {"W", "B", "W", "B", "W", "B", "W", "B"},
         {"B", "W", "B", "W", "B", "W", "B", "W"},
         {"W", "B", "W", "B", "W", "B", "W", "B"},
         {"B", "W", "B", "W", "B", "W", "B", "W"}
 };

 static final String[][] caseB = {
         {"B", "W", "B", "W", "B", "W", "B", "W"},
         {"W", "B", "W", "B", "W", "B", "W", "B"},
         {"B", "W", "B", "W", "B", "W", "B", "W"},
         {"W", "B", "W", "B", "W", "B", "W", "B"},
         {"B", "W", "B", "W", "B", "W", "B", "W"},
         {"W", "B", "W", "B", "W", "B", "W", "B"},
         {"B", "W", "B", "W", "B", "W", "B", "W"},
         {"W", "B", "W", "B", "W", "B", "W", "B"}
 };

 public static void main(String[] args) {
     // TODO Auto-generated method stub
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     try {
         String[] boardSize = br.readLine().split(" ");
         int M = Integer.parseInt(boardSize[0]);
         int N = Integer.parseInt(boardSize[1]);
         String[][] inputBoard = inputReader(br, M, N);
         int minCnt = 64;    // 8x8 ü������ ��ġ�µ� �ִ� ī��Ʈ �� 64�� ���� �ʱ�ȭ
         int tmp = 64;

         for (int i = 0; i <= inputBoard.length - 8; i++) {
             for (int j = 0; j <= inputBoard[i].length - 8; j++) {
                 String[][] board = cutArr(inputBoard, i, j);  // 8x8�� �߶� ����
                 tmp = rePaintBoard(board);
                 minCnt = Math.min(minCnt, tmp);
             }
         }
         System.out.println(minCnt);


     } catch (IOException e) {
         e.printStackTrace();
     }


 }

 // �־��� ü������ 2���� �迭�� �Է¹޴´�.
 private static String[][] inputReader(BufferedReader br, int M, int N) throws IOException {
     String[][] arr = new String[M][N];
     for (int i = 0; i < arr.length; i++) {
         String[] tmpArr = br.readLine().split("");
         for (int j = 0; j < tmpArr.length; j++) {
             arr[i][j] = tmpArr[j];
         }
     }
     return arr;
 }

 //  arr[M][N]�� ��ġ�������� 8x8����� �ڸ���.
 private static String[][] cutArr(String[][] inputArr, int M, int N) {
     String[][] board = new String[8][8];  //  8x8�� �߶� ���� �迭
//     int length1 = inputArr.length;  // inputArr�� �� ����
     int length2 = inputArr[0].length;   // �� ����
     for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {

             board[i][j] = inputArr[i + M][j +N];
         }
     }
     return board;
 }

 // �Է¹��� �迭�� ����ϴ� �Լ�
 private static void printArr(String[][] inputArr) {
     for (int i = 0; i < 8; i++) {
         System.out.println();
         for (int j = 0; j < 8; j++) {
             System.out.print(inputArr[i][j] + " ");
         }
     }
 }

 // ���带 �ٽ� ĥ�Ѵ�. �ٽ� ĥ�ؾ��� ĭ �� count
 private static int rePaintBoard(String[][] inputArr) {
     int caseACnt = 0;
     int caseBCnt = 0;

     for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {
             if (caseA[i][j].equals(inputArr[i][j])) {
                 caseACnt++;
             }
             if (caseB[i][j].equals(inputArr[i][j])) {
                 caseBCnt++;
             }
         }
     }
     return Math.min(caseACnt, caseBCnt);
 }

}