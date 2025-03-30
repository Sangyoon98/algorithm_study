package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1244 {
    static int[] switchArray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int switchCount = Integer.parseInt(br.readLine());
        switchArray = new int[switchCount + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= switchCount; i++) {
            switchArray[i] = Integer.parseInt(st.nextToken());
        }

        int studentCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < studentCount; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            switch (gender) {
                case 1: {   // 남학생
                    for (int j = number; j <= switchCount; j += number) swap(j);
                    break;
                }
                case 2: {   // 여학생
                    swap(number);
                    int min = number - 1;
                    int max = number + 1;

                    while (true) {
                        if (min > 0 && max <= switchCount && switchArray[min] == switchArray[max]) {
                            swap(min);
                            swap(max);
                            min -= 1;
                            max += 1;
                        } else break;
                    }
                    break;
                }
            }
        }

        for (int i = 1; i < switchArray.length; i++) {
            sb.append(switchArray[i]).append(" ");
            if (i % 20 == 0) sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void swap(int a) {
        if (switchArray[a] == 1) switchArray[a] = 0;
        else switchArray[a] = 1;
    }
}