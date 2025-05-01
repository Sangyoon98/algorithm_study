package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 3; i > 0; i--) {
            String s = br.readLine();

            if (s.chars().allMatch(Character::isDigit)) {
                int n = Integer.parseInt(s) + i;

                if (n % 3 == 0) {
                    if (n % 5 == 0) System.out.print("FizzBuzz");
                    else System.out.print("Fizz");
                } else if (n % 5 == 0) System.out.print("Buzz");
                else System.out.print(n);
                return;
            }
        }
    }
}