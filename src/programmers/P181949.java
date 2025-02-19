package programmers;

import java.util.Scanner;

public class P181949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : a) {
            if (Character.isLowerCase(c)) sb.append(Character.toString(c).toUpperCase());
            else sb.append(Character.toString(c).toLowerCase());
        }

        System.out.print(sb);
    }
}
