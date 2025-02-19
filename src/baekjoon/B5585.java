package baekjoon;

import java.util.Scanner;

public class B5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1000 - sc.nextInt();
        int[] change = { 500, 100, 50, 10, 5, 1 };
        int answer = 0;

        for (int i : change) {
            answer += N / i;
            N %= i;
        }

        System.out.print(answer);
    }
}
