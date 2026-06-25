package com.study.p49;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目 49：Stream
 * 练习目标：输入 5 个整数，使用 Stream 求偶数之和。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("请输入第 " + (i + 1) + " 个整数：");
            numbers[i] = scanner.nextInt();
        }

        // TODO：使用 Arrays.stream(numbers).filter(...).sum()。
        int evenSum = 0;
        System.out.println("偶数之和：" + evenSum);
    }
}

