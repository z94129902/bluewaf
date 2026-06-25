package com.study.p09;

import java.util.Scanner;

/**
 * 题目 09：算术运算符
 * 练习目标：计算两个整数的和、差、积、商和余数。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入 a：");
        int a = scanner.nextInt();
        System.out.print("请输入 b：");
        int b = scanner.nextInt();

        System.out.println("和：" + (a + b));
        System.out.println("差：" + 0); // TODO
        System.out.println("积：" + 0); // TODO
        System.out.println("商：" + 0); // TODO：假设 b 不为 0
        System.out.println("余数：" + 0); // TODO
    }
}

