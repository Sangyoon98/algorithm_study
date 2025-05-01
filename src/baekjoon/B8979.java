package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][4];
        int index = 0;
        int rank = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            arr[i][3] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                if (o1[2] == o2[2]) {
                    return Integer.compare(o1[3], o2[3]);
                }
                return Integer.compare(o1[2], o2[2]);
            } else return Integer.compare(o1[1], o2[1]);
        });

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == K) {
                index = i;
                break;
            }
        }

        for(int i = N - 1; i >= 0; i--){
            if(arr[i][1] == arr[index][1] && arr[i][2] == arr[index][2] && arr[i][3] == arr[index][3]){
                break;
            }
            else rank++;
        }

        System.out.print(rank + 1);
    }
}
