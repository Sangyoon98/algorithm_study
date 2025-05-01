package baekjoon;

import java.util.Scanner;

public class B1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        int n = 0;
        for (int i = 0; i < x; i++) n += months[i];
        n += y - 1;
        System.out.print(days[n % 7]);
    }
}