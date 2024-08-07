package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int topA = Integer.parseInt(st.nextToken());
        int bottomA = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int topB = Integer.parseInt(st.nextToken());
        int bottomB = Integer.parseInt(st.nextToken());

        int bottomResult = bottomA * bottomB;
        int topResult = (topA * bottomB) + (topB * bottomA);

        int gcd = calculate(topResult, bottomResult);
        System.out.println(topResult / gcd + " " + bottomResult / gcd);
    }

    public static int calculate(int top, int bottom) {
        if (top % bottom == 0) return bottom;
        return calculate(bottom, top % bottom);
    }
}
