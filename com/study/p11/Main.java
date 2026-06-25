package com.study.p11;

import java.util.Scanner;

/**
 * 题目 11：比较运算符
 * 练习目标：判断两个数的大小关系。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入 a：");
        int a = scanner.nextInt();
        System.out.print("请输入 b：");
        int b = scanner.nextInt();

        // TODO：补全三个布尔表达式。
        boolean greater = false;
        boolean equal = false;
        boolean lessOrEqual = false;

        System.out.println("a 是否大于 b：" + greater);
        System.out.println("a 是否等于 b：" + equal);
        System.out.println("a 是否小于等于 b：" + lessOrEqual);
    }
}

