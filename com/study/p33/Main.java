package com.study.p33;

import java.util.Scanner;

/**
 * 题目 33：方法重载
 * 练习目标：补全 int 和 double 两个版本的 add 方法。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入两个整数：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("请输入两个小数：");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println("整数和：" + add(a, b));
        System.out.println("小数和：" + add(x, y));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}

