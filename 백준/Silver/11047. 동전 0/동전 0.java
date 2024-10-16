import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];
        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int sum = 0;
        for (int i = N-1; i >= 0; i--) {
            count = K / coin[i];
            sum += count;
            K -= coin[i] * count;
        }
        System.out.println(sum);
    }
}