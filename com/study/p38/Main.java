package com.study.p38;

import java.util.Scanner;

/**
 * 题目 38：继承
 * 练习目标：让 Cat 继承 Animal，并复用 name 字段。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入宠物名字：");
        String name = scanner.nextLine();
        Cat cat = new Cat();
        cat.name = name;
        cat.eat();
        cat.meow();
    }
}

class Animal {
    String name;

    void eat() {
        System.out.println(name + " 正在吃饭");
    }
}

// TODO：观察 extends Animal 的作用：Cat 可以直接使用 name 字段和 eat 方法。
class Cat extends Animal {
    void meow() {
        System.out.println(name + " 喵喵叫");
    }
}
