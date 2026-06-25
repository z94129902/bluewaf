package com.study.p02;

import java.util.Scanner;

/**
 * 题目 02：Scanner 输入字符串
 * 练习目标：从控制台读取用户输入，并拼接输出。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的城市：");
        String city = scanner.nextLine();

        // TODO：把 city 拼接到 result 中。
        String result = "我来自：" + "南京";
        System.out.println(result);
    }
}

