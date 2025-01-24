package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class B11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        while (N-- > 0) arr.add(Integer.parseInt(br.readLine()));

        arr.sort(Comparator.reverseOrder());

        for (int i : arr) sb.append(i).append("\n");

        System.out.print(sb);
    }
}
