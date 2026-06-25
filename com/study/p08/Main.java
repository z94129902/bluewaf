package com.study.p08;

import java.util.Scanner;

/**
 * 题目 08：public static 方法
 * 练习目标：理解 main 调用同类中的静态方法。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个名字：");
        String name = scanner.nextLine();
        printWelcome(name);
    }

    public static void printWelcome(String name) {
        // TODO：输出“欢迎你，xxx”。
        System.out.println("欢迎你，"+name);
    }
}

