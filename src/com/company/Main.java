package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Объявить переменную типа String, название которой состоит из нескольких слов
        String words = "Hello Geektech";

        // Создать константу "num" типа int и задать ей любое значение
        final int num = 5;

        // Создать переменную "word" типа String с любым значением
        String word = "Hello Osh";

        // Задать значение переменной объявленной в самом начале, которое состояло бы из результата конкатенации константы "num" и переменной "word"
        String wordNum = "Hello osh" + 5;

        // Вывести на экран значение всех переменных в одну строку
        System.out.println(words + num + word + wordNum);

        // Добавить условную конструкцию которая бы выводила на экран следующее: если значение "num" меньше нулья- "Вы сохранили отрицательное число", если же значение больше нуля-"Вы сохранили положительное число",иначе- "Вы сохранили нуль"
        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }else if(num > 0){
            System.out.println("Вы сохранили положительное число");
        }else{
            System.out.println("Вы сохранили нуль");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();
    }
}
