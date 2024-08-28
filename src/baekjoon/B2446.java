package baekjoon;

import java.util.Scanner;

public class B2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * (N - i) - 1; j++) System.out.print("*");
            System.out.print("\n");
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.print("\n");
        }
    }
}