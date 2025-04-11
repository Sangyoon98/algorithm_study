/**
 #2. 비밀번호를 변경하려고 한다.
 비밀번호를 입력받아 비밀번호 변경에 성공하면 SUCCESS
 비밀번호가 기존 비밀번호와 동일하면 FAIL_SAME
 비밀번호가 최근 변경한 비밀번호 내역에 있으면 FAIL_EXIST 를 출력하라

 최근 변경한 비밀번호 내역은 N으로 주어지고 최근 순으로 L 만큼만 리스트에 저장한다.

 초기 비밀번호 = 000000
 최근 변경한 비밀번호 내역 리스트 길이 = L
 비밀번호 입력 개수 = N
 N 만큼 비밀번호 6자리 입력

    입력 :
            3
            10
            010101
            101010
            000000
            123456
            987654
            987654
            123451
            101010
            987654
            000000

    출력 :
            SUCCESS
            SUCCESS
            FAIL_EXIST
            SUCCESS
            SUCCESS
            FAIL_SAME
            SUCCESS
            SUCCESS
            FAIL_EXIST
            SUCCESS


*/

package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HyundaiAutoEver_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        Queue<String> queue = new LinkedList<>();
        Set<String> set = new HashSet<>();

        String currentPassword = "000000";
        queue.add("000000");
        set.add("000000");

        for (int i = 0; i < N; i++) {
            String password = br.readLine();

            if (password.equals(currentPassword)) System.out.println("FAIL_SAME");
            else if (set.contains(password)) System.out.println("FAIL_EXIST");
            else {
                System.out.println("SUCCESS");
                currentPassword = password;
                queue.add(password);
                set.add(password);

                if (queue.size() > L) {
                    String old = queue.poll();
                    set.remove(old);
                }
            }
        }
    }
}
