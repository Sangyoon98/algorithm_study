package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean isTag = false;
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                isTag = true;
                sb.append(temp.reverse()).append(s.charAt(i));
                temp = new StringBuilder();
            } else if (s.charAt(i) == '>') {
                isTag = false;
                sb.append(temp).append(s.charAt(i));
                temp = new StringBuilder();
            } else if (s.charAt(i) == ' ') {
                if (isTag) temp.append(s.charAt(i));
                else {
                    sb.append(temp.reverse()).append(s.charAt(i));
                    temp = new StringBuilder();
                }
            } else temp.append(s.charAt(i));
        }

        if (!temp.toString().isEmpty()) sb.append(temp.reverse());

        System.out.println(sb);
    }
}