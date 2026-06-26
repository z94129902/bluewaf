package com.study.p27;

import java.util.Scanner;

/**
 * 题目 27：数组统计偶数
 * 练习目标：统计 6 个整数中偶数的个数。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("请输入第 " + i + " 个整数：");
            int number = scanner.nextInt();
            // TODO：如果 number 是偶数，count 加 1。
            if(number%2 == 0) {
            	count++;
            }
        }

        System.out.println("偶数个数：" + count);
    }
}

