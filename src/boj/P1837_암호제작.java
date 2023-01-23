package boj;

import java.math.BigInteger;
import java.util.Scanner;

public class P1837_암호제작 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        int k = sc.nextInt();
        boolean s = true;
        int p = 0;

        for (int i = 2; i < k; i++) {
            if (n.remainder(BigInteger.valueOf(i)).intValue() == 0) {
                s = false;
                p = i;
                break;
            }
        }

        String result = s ? "GOOD" : "BAD " + p;

        System.out.println(result);
    }
}
