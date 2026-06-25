package com.study.p26;

import java.util.Scanner;

/**
 * 题目 26：数组最大值
 * 练习目标：找出数组中的最大数。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("请输入第 " + (i + 1) + " 个整数：");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            // TODO：如果 numbers[i] 比 max 大，就更新 max。
        }

        System.out.println("最大值：" + max);
    }
}

