package com.study.p45;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * 题目 45：日期时间
 * 练习目标：输入生日，计算到今天已经过了多少天。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入生日，例如 2000-01-01：");
        String birthdayText = scanner.nextLine();

        LocalDate birthday = LocalDate.parse(birthdayText);
        LocalDate today = LocalDate.now();
        // TODO：使用 ChronoUnit.DAYS.between 计算天数。
        long days = 0;
        System.out.println("你已经出生约 " + days + " 天");
    }
}

