package com.study.p46;

import java.util.Scanner;

/**
 * 题目 46：正则表达式
 * 练习目标：判断邮箱格式是否基本正确。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入邮箱：");
        String email = scanner.nextLine();

        // TODO：补全正则，要求包含 @ 和 .，且两边有内容。
        String regex = "TODO";
        boolean valid = email.matches(regex);
        System.out.println(valid ? "邮箱格式正确" : "邮箱格式不正确");
    }
}

