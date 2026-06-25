package com.study.p10;

import java.util.Scanner;

/**
 * 题目 10：自增自减
 * 练习目标：使用 ++ 和 -- 模拟库存变化。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入初始库存：");
        int stock = scanner.nextInt();

        // TODO：卖出一件，库存减少 1。
        stock = stock - 1;
        System.out.println("卖出一件后库存：" + stock);

        // TODO：补货一件，库存增加 1。
        stock = stock + 1;
        System.out.println("补货一件后库存：" + stock);
    }
}

