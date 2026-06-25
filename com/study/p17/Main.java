package com.study.p17;

import java.util.Scanner;

/**
 * 题目 17：switch 简易计算器
 * 练习目标：输入两个数和运算符，完成 + - * /。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        double a = scanner.nextDouble();
        System.out.print("请输入运算符 + - * /：");
        String op = scanner.next();
        System.out.print("请输入第二个数：");
        double b = scanner.nextDouble();

        double result = 0;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
            	result = a - b;
            	break;
            case "*":
            	result = a * b;
            	break;
            default:
                System.out.println("暂不支持该运算符");
                return;
        }
        System.out.println("结果：" + result);
    }
}

