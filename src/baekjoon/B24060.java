package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B24060 {
    static int[] tmp;
    static int result = -1;
    static int cnt = 0;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        tmp = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        mergeSort(A, 0, N - 1);

        System.out.println(result);
    }

    public static void mergeSort(int A[], int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(A, low, mid);
            mergeSort(A, mid + 1, high);
            merge(A, low, mid, high);
        }
    }

    public static void merge(int A[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= high) {
            if (A[i] <= A[j]) tmp[t++] = A[i++];
            else tmp[t++] = A[j++];
        }

        while (i <= mid) tmp[t++] = A[i++];
        while (j <= high) tmp[t++] = A[j++];

        i = low;
        t = 0;

        while (i <= high) {
            cnt++;
            if (cnt == K) {
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }
    }
}
