package com.study.p31;

/**
 * 题目 31：嵌套循环
 * 练习目标：打印 9x9 乘法表。
 */
public class Main {
    public static void main(String[] args) {
        // TODO：外层循环控制行，内层循环控制列。
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("TODO ");
            }
            System.out.println();
        }
    }
}

