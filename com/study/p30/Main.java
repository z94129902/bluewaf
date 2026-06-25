package com.study.p30;

import java.util.Scanner;

/**
 * 题目 30：do while 菜单
 * 练习目标：菜单至少执行一次，输入 0 退出。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. 学习 Java");
            System.out.println("2. 做练习题");
            System.out.println("0. 退出");
            System.out.print("请选择：");
            choice = scanner.nextInt();
            // TODO：根据 choice 输出不同提示。
        } while (choice != 0);

        System.out.println("程序结束");
    }
}

