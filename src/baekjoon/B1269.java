package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cntA = Integer.parseInt(st.nextToken());
        int cntB = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cntA; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cntB; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int result = 0;
        for (int num : setA) {
            if (!setB.contains(num)) result++;
        }

        for (int num : setB) {
            if (!setA.contains(num)) result++;
        }

        System.out.println(result);
    }
}
