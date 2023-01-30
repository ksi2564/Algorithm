//package boj;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class P18115_카드놓기 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        int n = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        int[] result = new int[n];
//        int front = 0;
//        int second;
//        int back = n - 1;
//
//        while (n > 0) {
//            int com = Integer.parseInt(st.nextToken());
//            if (com == 1) {
//                while (front < result.length && result[front] != 0) {
//                    front++;
//                }
//                result[front++] = n;
//            } else if (com == 2) {
//                second = front + 1;
//                while (second < result.length && result[second] != 0) {
//                    second++;
//                }
//                result[second] = n;
//            } else if (com == 3) {
//                while (back >= 0 && result[back] != 0) {
//                    back--;
//                }
//                result[back--] = n;
//            }
//            n--;
//        }
//        for (int j : result) {
//            sb.append(j).append(" ");
//        }
//        System.out.println(sb);
//    }
//}
