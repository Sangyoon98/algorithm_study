package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] arr = new String[S.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.substring(i);
        }

        Arrays.sort(arr);
        for (String s : arr) System.out.println(s);
    }
}
