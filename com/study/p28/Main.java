package com.study.p28;

import java.util.Scanner;

/**
 * 题目 28：for 循环阶乘
 * 练习目标：计算 n!，例如 5! = 120。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入 n：");
        int n = scanner.nextInt();
        int result = 1;

        // TODO：使用 for 循环，让 result 依次乘以 1 到 n。
        for (int i = 1; i <= n; i++) {
        	result = result * i;
        }

        System.out.println(n + "! = " + result);
    }
}

