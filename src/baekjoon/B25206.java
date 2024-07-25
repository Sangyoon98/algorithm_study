package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalScore = 0.0;
        double personalScore = 0.0;

        for (int i = 1; i <= 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double score = Double.parseDouble((st.nextToken()));
            String rank = st.nextToken();

            if (rank.equals("P")) {
                continue;
            }

            totalScore += score;
            personalScore += convertRank(rank) * score;
        }

        System.out.printf("%.6f", personalScore / totalScore);
    }

    public static double convertRank(String rank) {
        switch (rank) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            default:
                return 0.0;
        }
    }
}
