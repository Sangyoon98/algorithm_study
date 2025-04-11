/**
 #3. 한 차량이 목적지까지 도착을 해야한다.
 근데 기름이 없어서 기름을 넣고 가야 한다.
 현재 출발 지점이 0이라고 할 때, 최소한의 비용을 사용해 목적지까지 도착하면 드는 비용을 출력하라

 현재 남은 기름(N)과
 목적지 거리(M)와
 주유소 개수(K)와
 현재 위치에서 주유소까지의 거리(L1)와 리터당 가격(L2)이 한줄에 입력된다.

    입력 :
            5
            20
            4
            3 2
            6 6
            8 10
            9 3

    출력 :
            30


*/

package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HyundaiAutoEver_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int currentGas = Integer.parseInt(br.readLine());
        int destination = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 목적지를 거리만 있는 마지막 주유소로 추가
        arr[N][0] = destination;
        arr[N][1] = 0;

        // 거리 순으로 정렬
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        int currentPos = 0;
        int totalCost = 0;
        int idx = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while (currentPos + currentGas < destination) {
            int maxReach = currentPos + currentGas;

            // 도달 가능한 주유소 가격 큐에 추가
            while (idx < arr.length && arr[idx][0] <= maxReach) {
                pq.offer(arr[idx][1]);
                idx++;
            }

            // 도달 가능한 주유소가 없으면 종료
            if (pq.isEmpty()) {
                System.out.println("도착 불가능");
                return;
            }

            // 가장 싼 주유소에서 주유
            int cheapestPrice = pq.poll();

            // 다음 도달 목표까지 필요한 기름 계산
            int nextTarget = destination;
            if (idx < arr.length && arr[idx][0] > maxReach) {
                nextTarget = arr[idx][0];
            }

            int needFuel = nextTarget - maxReach;
            currentGas += needFuel;
            totalCost += needFuel * cheapestPrice;

            currentPos = maxReach;
            currentGas = 0;
        }

        System.out.println(totalCost);
    }
}
