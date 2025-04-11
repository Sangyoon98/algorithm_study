/**
 #1. 입출금 내역을 보고 통장 잔고를 출력하라 (단 통장 잔고가 출금 금액보다 적으면 출금하지 않는다.)

 현재 통장 잔고(current)와 거래 횟수(N)을 입력받아,
 거래 횟수만큼 거래 내역을 입력받는다.
 최종 잔고를 출력한다.

    입력 :
            2000
            5
            DEPOSIT 3000
            WITHDRAW 100
            DEPOSIT 40000
            WITHDRAW 2000
            DEPOSIT 200

    출력 :
            43100
*/

package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HyundaiAutoEver_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int current = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (s.equals("DEPOSIT")) current += num;
            else {
                if (current > num) current -= num;
            }
        }
        System.out.print(current);
    }
}
