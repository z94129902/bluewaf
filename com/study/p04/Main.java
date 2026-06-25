package com.study.p04;

import java.util.Scanner;

/**
 * 题目 04：double 类型和圆面积
 * 练习目标：使用 double、常量和乘法计算圆面积。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.1415926;
        System.out.print("请输入圆的半径：");
        double radius = scanner.nextDouble();

        // TODO：面积公式是 PI * 半径 * 半径。
        double area = PI * radius * radius;
        System.out.println("圆面积：" + area);
    }
}

