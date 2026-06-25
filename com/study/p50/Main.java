package com.study.p50;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 题目 50：综合练习 - 学生成绩管理
 * 练习目标：综合使用类、集合、循环、方法和条件判断。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("请输入学生人数：");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.print("第 " + i + " 个学生姓名：");
            String name = scanner.nextLine();
            System.out.print("第 " + i + " 个学生分数：");
            int score = scanner.nextInt();
            scanner.nextLine();
            students.add(new Student(name, score));
        }

        System.out.println("平均分：" + average(students));
        System.out.println("最高分学生：" + topStudent(students).name);
    }

    public static double average(List<Student> students) {
        int sum = 0;
        for (Student student : students) {
            // TODO：累加 student.score。
        }
        // TODO：返回平均分，注意转成 double。
        return 0.0;
    }

    public static Student topStudent(List<Student> students) {
        Student top = students.get(0);
        for (Student student : students) {
            // TODO：如果 student.score 更高，就更新 top。
        }
        return top;
    }
}

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

