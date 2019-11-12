package com.tool.algo.arrangementselect;

import org.junit.jupiter.api.Test;

/**
 * 重复字符串(换一种思路)
 *
 * @author: zhangyu
 */
public class RepeatedString6862 {
    @Test
    public void repeatedStringTestDemo() {
        String A = "abcd";
        String B = "cdabcdab";
        int count = repeatedStringMatch(A, B);
        System.out.println("count = " + count);
    }

    public int repeatedStringMatch(String A, String B) {
        StringBuilder res = new StringBuilder(A);
        int max = A.length() + B.length() + A.length();
        int count = 1;
        while (res.length() < max && res.indexOf(B) == -1) {
            res.append(A);
            count++;
        }
        return res.indexOf(B) == -1 ? -1 : count;
    }
}
