package com.study.p03;

import java.util.Scanner;

/**
 * 题目 03：整数输入和加法
 * 练习目标：读取两个整数并求和。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = scanner.nextInt();
        System.out.print("请输入第二个整数：");
        int b = scanner.nextInt();

        // TODO：把 0 改成 a 和 b 的和。
        int sum = 0;
        System.out.println("两数之和：" + sum);
    }
}

