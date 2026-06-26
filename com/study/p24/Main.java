package com.study.p24;

import java.util.Scanner;

/**
 * 题目 24：StringBuffer
 * 练习目标：使用 StringBuffer 拼接和反转字符串。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个单词：");
        String first = scanner.next();
        System.out.print("请输入第二个单词：");
        String second = scanner.next();

        StringBuffer buffer = new StringBuffer();
        buffer.append("first");
        buffer.append(" ");
        buffer.append("second");
        String joined = buffer.toString();
        String reversed = buffer.reverse().toString();
        System.out.println("拼接结果：" + joined);
        System.out.println("反转结果：" + reversed);
    }
}

