package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();

            if (map.containsKey(name)) map.remove(name);
            else map.put(name, state);
        }

        ArrayList<String> arr = new ArrayList<>(map.keySet());

        arr.sort(Collections.reverseOrder());

        for (String name : arr) {
            System.out.println(name);
        }
    }
}
