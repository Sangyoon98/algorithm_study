package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String password = br.readLine();
            if (password.equals("end")) break;

            int count = 0;
            boolean flag = false;
            char prev = '.';

            for (int i = 0; i < password.length(); i++) {
                if (isVowel(password.charAt(i))) flag = true;

                if (isVowel(password.charAt(i)) != isVowel(prev)) count = 1;
                else count++;

                if (count > 2 || (prev == password.charAt(i) && (password.charAt(i) != 'e' && password.charAt(i) != 'o'))) {
                    flag = false;
                    break;
                }

                prev = password.charAt(i);
            }

            if (flag) {
                System.out.printf("<%s> is acceptable.\n", password);
            } else System.out.printf("<%s> is not acceptable.\n", password);
        }
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
