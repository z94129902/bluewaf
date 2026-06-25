package com.study.p07;

import java.util.Scanner;

/**
 * 题目 07：变量命名
 * 练习目标：使用清晰的驼峰命名保存信息。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String studentName = scanner.nextLine();
        System.out.print("请输入年龄：");
        int studentAge = scanner.nextInt();

        // TODO：新增一个 boolean 变量 isAdult，判断年龄是否大于等于 18。
        boolean isAdult = studentAge >= 18;
        System.out.println(studentName + " 是否成年：" + isAdult);
    }
}

