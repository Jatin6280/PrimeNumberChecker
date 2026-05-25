package com.company;
import java.util.Scanner;

public class Main {
    static boolean Prime(int n) {
 
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();


        if (Prime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }

        sc.close();
    }
}
