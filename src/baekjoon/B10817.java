package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B10817 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
