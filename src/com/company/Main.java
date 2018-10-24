package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhập số Pentagonal : ");
        n = scanner.nextInt();
        System.out.println("Số Pentagonal bạn muốn biết là : " + getPentagonalNumber(n));

    }

    public static int getPentagonalNumber(int n){

        return ((n * (3 * n - 1)) / 2);

    }

}