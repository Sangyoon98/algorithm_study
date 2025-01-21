package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreElements()) {
            int temp = Integer.parseInt(st.nextToken());
            if (!arr.contains(temp)) arr.add(temp);
        }

        Collections.sort(arr);

        for (int i : arr) sb.append(i).append(" ");
        System.out.print(sb);
    }
}
