package baekjoon;

import java.util.Scanner;

public class B9625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[][] arr = new int[45][2];

        arr[0][0] = 0;
        arr[0][1] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;

        for (int i = 2; i < K; i++) {
            arr[i][0] = arr[i - 2][0] + arr[i - 1][0];
            arr[i][1] = arr[i - 2][1] + arr[i - 1][1];
        }

        System.out.print(arr[K - 1][0] + " " + arr[K - 1][1]);
    }
}