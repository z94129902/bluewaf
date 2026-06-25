package com.study.p12;

import java.util.Scanner;

/**
 * 题目 12：逻辑运算符
 * 练习目标：使用 &&、|| 和 ! 判断优惠资格。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age = scanner.nextInt();
        System.out.print("是否会员 true/false：");
        boolean vip = scanner.nextBoolean();

        // TODO：年龄小于 18 或者是会员，就可以享受优惠。
        boolean canDiscount = false;
        System.out.println("是否可享受优惠：" + canDiscount);
    }
}

