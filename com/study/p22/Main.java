package com.study.p22;

import java.util.Scanner;

/**
 * 题目 22：String equals
 * 练习目标：使用 equals 判断用户名和密码。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("用户名：");
        String username = scanner.nextLine();
        System.out.print("密码：");
        String password = scanner.nextLine();

        // TODO：用户名为 admin 且密码为 123456 时登录成功。
        boolean success = username.equals("admin") && password.equals("123456");
        System.out.println(success ? "登录成功" : "登录失败");
    }
}

