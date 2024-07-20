package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B11382 {
    public static void main(String[] args) throws IOException {
        /** Scanner 사용 */
        /*Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(a + b + c);*/

        /** BufferedReader 사용 */
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        System.out.println(a + b + c);*/

        /** BufferedReader + while 사용 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long result = 0;
        while (st.hasMoreElements()) {
            result += Long.parseLong(st.nextToken());
        }
        System.out.println(result);
    }
}
