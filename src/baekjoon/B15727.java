package baekjoon;

import java.util.Scanner;

public class B15727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        System.out.print((L % 5 == 0) ? (L / 5) : (L / 5 + 1));
    }
}