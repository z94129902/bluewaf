package com.study.p21;

import java.util.Scanner;

/**
 * 题目 21：String 长度
 * 练习目标：读取一句话，输出它的字符数量。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一句话：");
        String text = scanner.nextLine();

        // TODO：调用 text.length()。
        int length = text.length();
        System.out.println("字符数量：" + length);
    }
}

