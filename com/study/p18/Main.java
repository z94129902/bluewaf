package com.study.p18;

import java.util.Scanner;

/**
 * 题目 18：Math.max 和 Math.abs
 * 练习目标：使用 Math 工具类。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入 a：");
        int a = scanner.nextInt();
        System.out.print("请输入 b：");
        int b = scanner.nextInt();

        // TODO：使用 Math.max 求较大值，使用 Math.abs 求 a-b 的绝对值。
        int max = Math.max(a, b);
        int distance = Math.abs(a - b);
        System.out.println("较大值：" + max);
        System.out.println("距离：" + distance);
    }
}

