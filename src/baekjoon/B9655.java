package baekjoon;

import java.util.Scanner;

public class B9655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(N % 2 == 0 ? "CY" : "SK");
    }
}
