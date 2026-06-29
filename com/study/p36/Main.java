package com.study.p36;

import java.util.Scanner;

/**
 * 题目 36：static 静态变量
 * 练习目标：统计创建了多少个 Person 对象。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要创建的人数：");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            new Person();
        }
        System.out.println("创建人数：" + Person.count);
    }
}

class Person {
    static int count = 0;

    Person() {
        // TODO：每创建一个对象，count 加 1。
    	Person.count ++;
    }
}

