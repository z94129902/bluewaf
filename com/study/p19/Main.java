package com.study.p19;

import java.util.Scanner;

/**
 * 题目 19：Math.pow 和 Math.sqrt
 * 练习目标：计算平方和平方根。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数字：");
        double number = scanner.nextDouble();

        // TODO：计算 number 的平方和平方根。
        double square = Math.pow(number, 2);
        double root = Math.sqrt(number);
        System.out.println("平方：" + square);
        System.out.println("平方根：" + root);
    }
}

