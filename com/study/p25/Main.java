package com.study.p25;

import java.util.Scanner;

/**
 * 题目 25：数组求和
 * 练习目标：读取 5 个整数存入数组，并求和。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("请输入第 " + (i + 1) + " 个整数：");
            numbers[i] = scanner.nextInt();
            sum = sum + numbers[i];
        }

        System.out.println("总和：" + sum);
    }
}

