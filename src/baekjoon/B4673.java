package baekjoon;

import java.io.IOException;

public class B4673 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        boolean[] check = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = d(i);
            if (n < 10001) check[n] = true;
        }

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) sb.append(i).append("\n");
        }

        System.out.println(sb);
    }

    public static int d(int num) {
        int sum = num;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
