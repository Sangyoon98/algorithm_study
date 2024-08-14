package baekjoon;

import java.io.*;

public class B17103 {
    static boolean[] arr = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        find();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;

            if (N % 2 == 0 &&  N != 0) {
                for (int j = 2; j <= N / 2; j++) {
                    if (!arr[j]) {
                        if (!arr[N - j]) {
                            count++;
                        }
                    }
                }
                bw.write(count + "\n");
            } else {
                bw.write(0 + " \n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }

    static void find() {
        arr[0] = arr[1] = true;

        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                for (int j = 2; i * j < arr.length; j++) {
                    arr[i * j] = true;
                }
            }
        }
    }
}
