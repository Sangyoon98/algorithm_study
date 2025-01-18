package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) arr.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) arr.add(Integer.parseInt(st.nextToken()));

        Collections.sort(arr);

        for (int i : arr) sb.append(i).append(" ");

        System.out.print(sb);
    }
}
