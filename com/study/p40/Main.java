package com.study.p40;

import java.util.Scanner;

/**
 * 题目 40：接口
 * 练习目标：让 Phone 实现 Chargeable 接口。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入设备名：");
        String name = scanner.nextLine();
        Phone phone = new Phone(name);
        phone.charge();
    }
}

interface Chargeable {
    void charge();
}

// TODO：观察 implements Chargeable 的作用：Phone 必须提供 charge 方法。
class Phone implements Chargeable {
    private final String name;

    Phone(String name) {
        this.name = name;
    }

    public void charge() {
        System.out.println(name + " 正在充电");
    }
}
