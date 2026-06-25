package com.study.p20;

import java.util.Scanner;

/**
 * 题目 20：Character 类
 * 练习目标：判断输入字符是数字、字母还是其他字符。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符：");
        char ch = scanner.next().charAt(0);

        // TODO：使用 Character.isDigit 和 Character.isLetter。
        if (false) {
            System.out.println("数字");
        } else if (false) {
            System.out.println("字母");
        } else {
            System.out.println("其他字符");
        }
    }
}

