package com.study.p44;

import java.util.Scanner;

/**
 * 题目 44：throw 抛出异常
 * 练习目标：年龄不合法时主动抛出异常。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age = scanner.nextInt();

        try {
            checkAge(age);
            System.out.println("年龄合法");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) {
        // TODO：如果 age 小于 0 或大于 120，抛出 IllegalArgumentException。
    }
}

