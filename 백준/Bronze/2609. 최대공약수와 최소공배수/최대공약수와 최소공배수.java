import java.io.*;
import java.util.StringTokenizer;
/*
 * 문제 설명: 최대공약수와 최소공배수
 * 핵심 개념: 유클리드 호제법
 */

public class Main{

    // 최대공약수 반복문 방식
    public static int gcd(int a, int b){
        int r;
        while(b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int gcd = (x > y) ? gcd(x, y) : gcd(y, x);

        System.out.println(gcd);
        System.out.println(x * y / gcd);
    }
}