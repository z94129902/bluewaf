package com.study.p29;

import java.util.Scanner;

/**
 * 题目 29：while 循环数字和
 * 练习目标：输入一个正整数，计算每一位数字之和。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入正整数：");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            // TODO：取个位数累加，再去掉个位数。
            break;
        }

        System.out.println("数字和：" + sum);
    }
}

