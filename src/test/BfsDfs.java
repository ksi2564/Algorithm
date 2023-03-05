package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BfsDfs {
    static int N, M, V;
    static boolean[][] matrix;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken()); // 정점 개수
        M = Integer.parseInt(st.nextToken()); // 간선 개수
        V = Integer.parseInt(st.nextToken()); // 탐색 정점

        matrix = new boolean[N + 1][N + 1];
        visit = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            matrix[n1][n2] = true;
            matrix[n2][n1] = true;
        }

        BFS(V);
        System.out.println(sb);

    }

    static Queue<Integer> queue = new ArrayDeque<>();

    static void BFS(int node) {
        queue.offer(node);
        visit[node] = true;
        sb.append(node).append(' ');

        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int i = 1; i <= N; i++) {
                if (!matrix[v][i] || visit[i]) continue;
                queue.offer(i);
                visit[i] = true;
                sb.append(i).append(' ');
            }
        }
    }
}
