package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class B11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            long a = Long.parseLong(br.readLine());
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int max = 0;
        long num = 0;

        for (long l : map.keySet()) {
            if (map.get(l) > max) {
                max = map.get(l);
                num = l;
            } else if (map.get(l) == max) {
                num = Math.min(l, num);
            }
        }

        System.out.print(num);
    }
}