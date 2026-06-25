package com.study.p05;

import java.util.Scanner;

/**
 * 题目 05：变量交换
 * 练习目标：使用临时变量交换两个变量的值。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入 a：");
        int a = scanner.nextInt();
        System.out.print("请输入 b：");
        int b = scanner.nextInt();

        // TODO：补全三行代码，交换 a 和 b。
        int temp = 0;
         temp = a;
         a = b;
         b = temp;

        System.out.println("交换后 a=" + a + ", b=" + b);
    }
}

