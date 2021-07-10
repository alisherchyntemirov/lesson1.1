package com.company;


import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
           String myAge;





           final int NUM = 32;
           String word = " кошка";
           myAge = NUM + word;
           System.out.println(myAge);
           if (NUM < 0) {
               System.out.println("“Вы сохранили отрицательное число");
           } else if (NUM > 0) {
               System.out.println("Вы сохранили положительное число");
           } else {
               System.out.println("Вы сохранили ноль");
           }
           System.out.println("Введите ваше имя:");
           Scanner scanner = new Scanner(System.in);
           String name;
           name = scanner.nextLine();
           System.out.println("Здравствуйте " + name);

    }

}