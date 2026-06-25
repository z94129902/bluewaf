package com.study.p13;

import java.util.Scanner;

/**
 * 题目 13：if 条件语句
 * 练习目标：判断考试是否及格。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入分数：");
        int score = scanner.nextInt();

        // TODO：如果 score 大于等于 60，输出“及格”，否则输出“不及格”。
        if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}

