package com.study.p35;

import java.util.Scanner;

/**
 * 题目 35：对象方法
 * 练习目标：给账户对象存钱和取钱。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        System.out.print("存入金额：");
        account.deposit(scanner.nextDouble());
        System.out.print("取出金额：");
        account.withdraw(scanner.nextDouble());
        System.out.println("余额：" + account.balance);
    }
}

class BankAccount {
    double balance = 0;

    void deposit(double money) {
        this.balance += money;
    }

    void withdraw(double money) {
        this.balance -= money;
    }
}

