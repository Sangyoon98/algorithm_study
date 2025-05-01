package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B1251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 2; i < str.length(); i++) {
            for (int j = 1; j < i; j++) {
                StringBuilder str1 = new StringBuilder(str.substring(0, j));
                StringBuilder str2 = new StringBuilder(str.substring(j, i));
                StringBuilder str3 = new StringBuilder(str.substring(i));
                String s1 = str1.reverse().toString();
                String s2 = str2.reverse().toString();
                String s3 = str3.reverse().toString();
                list.add(s1 + s2 + s3);
            }
        }

        Collections.sort(list);
        System.out.print(list.get(0));
    }
}
