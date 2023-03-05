package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class P2001_파리퇴치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] table = new int[n][n];
            for (int i = 0; i < n; i++) {
                int sum = 0;
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    sum += Integer.parseInt(st.nextToken());
                    table[i][j] = sum;
                }
            }
            int max = 0;
            for (int i = 0; i <= n - m; i++) {
                for (int j = m - 1; j < n; j++) {
                    int result = 0;
                    for (int k = i; k < i + m; k++) {
                        result += j == m - 1 ? table[k][j] : table[k][j] - table[k][j - m];
                    }
                    max = Math.max(max, result);
                }
            }
            sb.append("#").append(t).append(" ").append(max).append("\n");
        }
        System.out.println(sb);
    }
}
