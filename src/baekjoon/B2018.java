package baekjoon;

import java.util.Scanner;

public class B2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 0;

        while (start <= N) {
            while (++end <= N) {
                sum += end;
                if (sum >= N) {
                    if (sum == N) count++;
                    break;
                }
            }
            while (++start <= N) {
                sum -= start;
                if (sum <= N) {
                    if (sum == N) count++;
                    break;
                }
            }
        }
        System.out.print(count);
    }
}
