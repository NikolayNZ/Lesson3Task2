package com.gmail.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
начинается с единицы. На одном этаже 4 квартиры. Напишите программу
которая получит номер квартиры с клавиатуры, и выведет на экран на
каком этаже, какого подъезда расположенна эта квартира. Если такой
квартиры нет в этом доме то нужно сообщить об этом пользователю.*/

        Scanner scf = new Scanner(System.in);

        int flat;
        int floor = 9;
        int entrance = 4;
        int apartments = 4;
        int maximum = floor * entrance * apartments;
        int ae = maximum / entrance; // количество квартир в подьезде

        System.out.println("Введите номер квартиры");
        flat = scf.nextInt();

        if (flat <= maximum && flat > 0) {
            int entrance1  =(int) Math.ceil ((double) flat / ae);

            System.out.println("Подьезд №  " + (entrance1));
            int floor1 = (flat - ae * (entrance1 - 1) - 1) / 4 + 1;


            System.out.println("Этаж № " +(short) + floor1);
        } else {
            System.out.println("Такого номера квартиры в этом доме НЕТ");
            }
        }
    }
