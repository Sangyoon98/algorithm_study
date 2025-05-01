package baekjoon;

import java.util.Scanner;

public class B2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2 * (N - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.print("\n");
        }

        for (int i = 1; i <= N - 1; i++) {
            for (int j = 0; j < N - i; j++) System.out.print("*");
            for (int j = 0; j < 2 * i; j++) System.out.print(" ");
            for (int j = 0; j < N - i; j++) System.out.print("*");
            System.out.print("\n");
        }
    }
}