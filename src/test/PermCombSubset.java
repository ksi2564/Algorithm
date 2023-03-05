package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermCombSubset {
    static int[] src = {1, 2, 3, 4, 5};
    static int[] tgt = new int[3];
    static boolean[] select = new boolean[5];

    public static void main(String[] args) {
//        perm(0);
//        comb(0, 0);
        subSet(0);
    }

    static void subSet(int srcIdx) {
        if (srcIdx == src.length) {
            List<Integer> list = new ArrayList<>(5);
            for (int i = 0; i < src.length; i++) {
                if (!select[i]) continue;
                list.add(src[i]);
            }
            System.out.println(list);
            return;
        }

        select[srcIdx] = true;
        subSet(srcIdx + 1);
        select[srcIdx] = false;
        subSet(srcIdx + 1);
    }

    static void comb(int srcIdx, int tgtIdx) {
        if (tgtIdx == tgt.length) {
            System.out.println(Arrays.toString(tgt));
            return;
        }
        if (srcIdx == src.length) return;

        tgt[tgtIdx] = src[srcIdx];

        comb(srcIdx + 1, tgtIdx + 1);
        comb(srcIdx + 1, tgtIdx);
    }

    static void perm(int tgtIdx) {
        if (tgtIdx == tgt.length) {
            System.out.println(Arrays.toString(tgt));
            return;
        }
        for (int i = 0; i < src.length; i++) {
            if (select[i]) continue;
            tgt[tgtIdx] = src[i];
            select[i] = true;
            perm(tgtIdx + 1);
            select[i] = false;
        }
    }
}
