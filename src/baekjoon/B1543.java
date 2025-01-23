package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String search = br.readLine();
        int count = 0;

        while (!str.isEmpty()) {
            if (str.startsWith(search)) {
                count++;
                str = str.substring(search.length());
            } else str = str.substring(1);
        }

        System.out.print(count);
    }
}
