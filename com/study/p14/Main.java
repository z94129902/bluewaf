package com.study.p14;

import java.util.Scanner;

/**
 * 题目 14：if else 求较大值
 * 练习目标：输入两个整数，输出较大的那个。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入 a：");
        int a = scanner.nextInt();
        System.out.print("请输入 b：");
        int b = scanner.nextInt();

        int max;
        // TODO：补全 if 条件。
        if (false) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("较大值：" + max);
    }
}

