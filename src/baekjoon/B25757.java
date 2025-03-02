package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B25757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        HashSet<String> set = new HashSet<>();

        while (N-- > 0) set.add(br.readLine());

        System.out.print(set.size() / people(game));
    }

    public static int people(String game) {
        switch (game) {
            case "Y": return 1;
            case "F": return 2;
            case "O": return 3;
        }
        return -1;
    }
}
