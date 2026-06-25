package com.study.p43;

import java.util.Scanner;

/**
 * 题目 43：异常处理
 * 练习目标：处理除数为 0 的情况。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入 a：");
        int a = scanner.nextInt();
        System.out.print("请输入 b：");
        int b = scanner.nextInt();

        try {
            // TODO：输出 a / b。
            System.out.println("结果：" + 0);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为 0");
        }
    }
}

