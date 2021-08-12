package _bruteForce;
import java.io.*;

//브루트포스 : 체스판 다시 칠하기
public class _bruteForce4 {
 // 고쳐야할 부분을 비교해서 카운트하기 위한 원래 체스판 모형 상수 선언
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
         int minCnt = 64;    // 8x8 체스판을 고치는데 최대 카운트 수 64로 변수 초기화
         int tmp = 64;

         for (int i = 0; i <= inputBoard.length - 8; i++) {
             for (int j = 0; j <= inputBoard[i].length - 8; j++) {
                 String[][] board = cutArr(inputBoard, i, j);  // 8x8로 잘라낸 보드
                 tmp = rePaintBoard(board);
                 minCnt = Math.min(minCnt, tmp);
             }
         }
         System.out.println(minCnt);


     } catch (IOException e) {
         e.printStackTrace();
     }


 }

 // 주어진 체스판을 2차원 배열에 입력받는다.
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

 //  arr[M][N]의 위치에서부터 8x8행렬을 자른다.
 private static String[][] cutArr(String[][] inputArr, int M, int N) {
     String[][] board = new String[8][8];  //  8x8로 잘라낼 보드 배열
//     int length1 = inputArr.length;  // inputArr의 행 길이
     int length2 = inputArr[0].length;   // 열 길이
     for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {

             board[i][j] = inputArr[i + M][j +N];
         }
     }
     return board;
 }

 // 입력받은 배열을 출력하는 함수
 private static void printArr(String[][] inputArr) {
     for (int i = 0; i < 8; i++) {
         System.out.println();
         for (int j = 0; j < 8; j++) {
             System.out.print(inputArr[i][j] + " ");
         }
     }
 }

 // 보드를 다시 칠한다. 다시 칠해야할 칸 수 count
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