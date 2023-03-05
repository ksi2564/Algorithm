package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13416_주식투자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int max = Integer.parseInt(st.nextToken());
                for (int j = 0; j < 2; j++) {
                    max = Math.max(max, Integer.parseInt(st.nextToken()));
                }
                if (max > 0) result += max;
            }
            System.out.println(result);
        }
    }
}
