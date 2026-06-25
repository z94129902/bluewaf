package com.study.p47;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 题目 47：FileWriter 写文件
 * 练习目标：把控制台输入写入当前目录的 p47_note.txt。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要保存的内容：");
        String content = scanner.nextLine();

        try (FileWriter writer = new FileWriter("p47_note.txt")) {
            // TODO：把 content 写入文件。
            System.out.println("写入完成：p47_note.txt");
        } catch (IOException e) {
            System.out.println("写入失败：" + e.getMessage());
        }
    }
}

