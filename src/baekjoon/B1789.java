package baekjoon;

import java.util.Scanner;

public class B1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long sum = 0;
        long count = 0;

        while (true) {
            sum += count;
            if (sum > S) break;
            count++;
        }

        System.out.println(count - 1);
    }
}