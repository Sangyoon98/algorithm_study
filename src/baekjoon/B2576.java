package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a % 2 == 1) {
                arr.add(a);
                count += a;
            }
        }

        if (arr.isEmpty()) System.out.println(-1);
        else {
            Collections.sort(arr);
            System.out.println(count + "\n" + arr.get(0));
        }
    }
}