package com.study.p42;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 题目 42：HashMap
 * 练习目标：统计一句话中每个单词出现的次数。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入英文句子，单词用空格分隔：");
        String line = scanner.nextLine();

        Map<String, Integer> counts = new HashMap<>();
        String[] words = line.split(" ");
        for (String word : words) {
            // TODO：使用 getOrDefault 统计次数。
        }

        System.out.println(counts);
    }
}

