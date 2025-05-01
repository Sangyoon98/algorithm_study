package baekjoon;

import java.util.Scanner;

public class B14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        do {
            if (n % 5 == 0) n -= 5;
            else n -= 2;
            count++;
        } while (n > 0);

        if (n != 0) System.out.print(-1);
        else System.out.print(count);
    }
}
