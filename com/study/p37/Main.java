package com.study.p37;

import java.util.Scanner;

/**
 * 题目 37：封装
 * 练习目标：使用 private 字段、setter 和 getter。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.print("请输入昵称：");
        user.setNickname(scanner.nextLine());
        System.out.println("昵称：" + user.getNickname());
    }
}

class User {
    private String nickname;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        // TODO：返回成员变量 nickname。
        return this.nickname;
    }
}

