package com.tool.algo.arrangementselect;

import org.junit.jupiter.api.Test;

/**
 * 复数相乘
 *
 * @author: zhangyu
 */
public class ComplexNumber537 {
    @Test
    public void complexTestDemo() {
        String a = "-11+-30i";
        String b = "55+-69i";
        // String a = "1+-1i";
        // String b = "1+-1i";
        String result = complexNumberMultiply(a, b);
        System.out.println("result = " + result);
    }

    public String complexNumberMultiply(String a, String b) {
        int i1 = a.indexOf('+');
        int i2 = a.indexOf('i');
        int j1 = b.indexOf('+');
        int j2 = b.indexOf('i');

        int a1 = Integer.parseInt(a.substring(0, i1));
        int b1 = Integer.parseInt(a.substring(i1 + 1, i2));
        int a2 = Integer.parseInt(b.substring(0, j1));
        int b2 = Integer.parseInt(b.substring(j1 + 1, j2));

        int aa = a1 * a2 - b1 * b2;
        int bb = a1 * b2 + a2 * b1;

        return aa + "+" + bb + "i";
    }
}
