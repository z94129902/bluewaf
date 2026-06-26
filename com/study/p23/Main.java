package com.study.p23;

import java.util.Scanner;

/**
 * 题目 23：String 截取
 * 练习目标：从身份证号中截取出生年份。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入 18 位身份证号：");
        String id = scanner.nextLine();

        // TODO：出生年份通常是第 7 到第 10 位，substring 下标从 0 开始。
        String year = id.substring(6, 10);
        System.out.println("出生年份：" + year);
    }
}

