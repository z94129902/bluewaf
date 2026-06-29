package com.study.p39;

import java.util.Scanner;

/**
 * 题目 39：方法重写和多态
 * 练习目标：根据输入创建不同对象，并调用重写后的 speak 方法。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入 dog 或 cat：");
        String type = scanner.nextLine();

        Animal animal;
        if ("dog".equalsIgnoreCase(type)) {
            animal = new Dog();
        } else {
            animal = new Cat();
        }
        animal.speak();
    }
}

class Animal {
    void speak() {
        System.out.println("动物发出声音");
    }
}

class Dog extends Animal {
    void speak() {
    	System.out.println("小狗汪汪叫");
    }
}

class Cat extends Animal {
    void speak() {
    	System.out.println("小猫喵喵叫");
    }
}

