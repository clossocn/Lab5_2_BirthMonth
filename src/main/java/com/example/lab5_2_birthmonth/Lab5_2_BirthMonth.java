package com.example.lab5_2_birthmonth;
import java.util.Scanner;

public class Lab5_2_BirthMonth {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your birth month (1 - 12): ");
            int birthMonth = scanner.nextInt();

            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }

            scanner.close();
        }

}
