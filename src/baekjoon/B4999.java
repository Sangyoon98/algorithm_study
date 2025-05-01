package baekjoon;

import java.util.Scanner;

public class B4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String me = sc.next();
        String doctor = sc.next();

        System.out.print(me.contains(doctor) ? "go" : "no");
    }
}