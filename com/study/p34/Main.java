package com.study.p34;

import java.util.Scanner;

/**
 * 题目 34：构造方法
 * 练习目标：通过构造方法初始化学生对象。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("姓名：");
        String name = scanner.nextLine();
        System.out.print("年龄：");
        int age = scanner.nextInt();

        Student student = new Student(name, age);
        student.show();
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        // TODO：把参数赋值给成员变量。
    }

    void show() {
        System.out.println("学生：" + name + "，年龄：" + age);
    }
}

