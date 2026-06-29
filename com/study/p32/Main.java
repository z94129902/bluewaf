package com.study.p32;

import java.util.Scanner;

/**
 * 题目 32：方法返回值
 * 练习目标：补全 max 方法，返回两个数中较大的一个。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入 a：");
        int a = scanner.nextInt();
        System.out.print("请输入 b：");
        int b = scanner.nextInt();
        System.out.println("较大值：" + max(a, b));
    }

    public static int max(int a, int b) {
        // TODO：返回 a 和 b 中较大的值。
        if(a >= b) {
        	return a;
        } else {
        	return b;
        }
    }
}

