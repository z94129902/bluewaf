package com.study.p41;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 题目 41：ArrayList
 * 练习目标：输入 3 个名字，保存到集合并遍历输出。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("请输入第 " + i + " 个名字：");
            String name = scanner.nextLine();
            names.add(name);
        }

        for (String name : names) {
            System.out.println("你好，" + name);
        }
    }
}

