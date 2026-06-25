package com.study.p48;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 题目 48：BufferedReader 读文件
 * 练习目标：读取指定文本文件，并统计行数。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要读取的文件名，例如 p47_note.txt：");
        String fileName = scanner.nextLine();

        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // TODO：输出当前行，并让 lines 加 1。
            }
            System.out.println("总行数：" + lines);
        } catch (IOException e) {
            System.out.println("读取失败：" + e.getMessage());
        }
    }
}

