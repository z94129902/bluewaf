package com.study.p15;

import java.util.Scanner;

/**
 * 题目 15：else if 成绩等级
 * 练习目标：根据分数输出 A/B/C/D。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入分数：");
        int score = scanner.nextInt();

        // TODO：90 及以上 A，80-89 B，60-79 C，否则 D。
        if (score >= 90) {
            System.out.println("A");
        } else if (80 <= score && score <= 89) {
            System.out.println("B");
        } else if (score >= 60 && score <= 79) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}

