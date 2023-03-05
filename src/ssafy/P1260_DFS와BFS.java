package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1260_DFS와BFS {
    static int N, M, V;
    static List<List<Integer>> list = new ArrayList<>();
    static Queue<Integer> queue = new ArrayDeque<>();
    static boolean[] visit;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        // 2중 arraylist 생성
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }
        visit = new boolean[N + 1];
        // 연결리스트에 기록
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            list.get(n1).add(n2);
            list.get(n2).add(n1);
        }

        dfs(V);
        sb.append('\n');
        visit = new boolean[N + 1];
        bfs(V);
        System.out.println(sb);
    }

    static void dfs(int node) {
        visit[node] = true;
        sb.append(node).append(" ");
        for (int i : list.get(node)) {
            if (visit[i]) continue;
            dfs(i);
        }
    }

    static void bfs(int node) {
        queue.offer(node);
        while (!queue.isEmpty()) {
            int v = queue.poll();
            if (visit[v]) continue;
            visit[v] = true;
            sb.append(v).append(" ");
            for (int i : list.get(v)) {
                queue.offer(i);
            }
        }
    }
}
