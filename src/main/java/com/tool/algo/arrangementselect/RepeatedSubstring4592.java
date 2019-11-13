package com.tool.algo.arrangementselect;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 重复子字符串（换一种思路）
 *
 * @author: zhangyu
 */
public class RepeatedSubstring4592 {
    @Test
    public void repeatedSubstring() {
        String s = "abcabcabc";
        boolean flag = repeatedSubstringPattern(s);
        System.out.println("flag = " + flag);
    }

    /**
     * 判断是否是重复子字符串
     *
     * @param s 主字符串
     * @return 返回布尔值
     */
    public boolean repeatedSubstringPattern(String s) {
        List<String> subStrList = getSubStrList(s);
        boolean flag = false;
        for (String str : subStrList) {
            if (isDivide(str, s)) {
                flag = true;
            }
        }
        return flag;
    }

    /**
     * 判断字符串是否被整除
     *
     * @param str 分割字符串
     * @param s   主字符串
     * @return 返回布尔值
     */
    private boolean isDivide(String str, String s) {
        String[] strings = s.split(str);
        String result = Arrays.asList(strings).stream().collect(Collectors.joining(""));
        return result.isEmpty();
    }

    /**
     * 获取所有的子串
     *
     * @param s 主字符串
     * @return 返回所有的字符串
     */
    private List<String> getSubStrList(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < s.length(); i++) {
            list.add(s.substring(0, i));
        }
        return list;
    }
}
