package com.study.p16;

import java.util.Scanner;

/**
 * 题目 16：switch 星期
 * 练习目标：根据数字 1-7 输出星期几。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入 1-7：");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            // TODO：补全 2-7 的 case。
            default:
                System.out.println("输入有误");
        }
    }
}

