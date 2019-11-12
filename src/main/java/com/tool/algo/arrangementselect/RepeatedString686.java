package com.tool.algo.arrangementselect;

import org.junit.jupiter.api.Test;

/**
 * 重复字符串
 *
 * @author: zhangyu
 */
public class RepeatedString686 {
    @Test
    public void repeatedStringTestDemo() {
        String A = "abcd";
        String B = "cdabcdab";
        int count = repeatedStringMatch(A, B);
        System.out.println("count = " + count);
    }

    /**
     * 找出A重复的最小次数包含B
     *
     * @param A 输入字符串A
     * @param B 字符串C
     * @return
     */
    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int repeatTimes = B.length() / A.length() + 1;
        while (i < repeatTimes) {
            sb.append(A);
            i++;
            if (sb.toString().contains(B)) {
                return i;
            }
        }
        return -1;
    }
}
