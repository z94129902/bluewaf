package com.study.p06;

import java.util.Scanner;

/**
 * 题目 06：final 常量
 * 练习目标：使用 final 定义固定折扣。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double DISCOUNT = 0.8;
        System.out.print("请输入商品原价：");
        double price = scanner.nextDouble();

        // TODO：计算打八折后的价格。
        double finalPrice = price;
        System.out.println("折后价格：" + finalPrice);
    }
}

