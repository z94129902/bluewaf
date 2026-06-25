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
            case 2:
                System.out.println("星期二");
                break;
              case 3:
                System.out.println("星期三");
                break;
              case 4:
                System.out.println("星期四");
                break;
              case 5:
                System.out.println("星期五");
                break;
              case 6:
                System.out.println("星期六");
                break;
              case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}

