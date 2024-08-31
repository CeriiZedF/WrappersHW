package com.example.wrapper;

import java.util.Scanner;

public class StringTest {
    //1
    public static void main(String[] args) {
        //2
        String string1 = "Hello World";
        String string2 = new String("123Hello World123");
        char[] chat_array = {'s', 'd', 'h', '2', 'y', 'd', '5'};
        String string3 = new String(chat_array);
        Byte[] byte_array = {2, 4, 7, 3, 7, 2, 7, 3, 9, 7, 8, 4};
        String string4 = byte_array.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string1);
        String string5 = stringBuilder.toString();

        //3 -> 3.1 - 3.4
        String string6 = "Апельсин,Яблоко,Гранат,Груша";
        String[] string_array = string6.split(",");
        System.out.println(getMaxLengthString(string_array)); //myMethod
        getThreeSymbols(string_array);

        // 3.5 - 3.8
        String string7 = "   Я_новая_строка      ";
        string7 = string7.trim();
        string7 = string7.replace("_", " ");
        System.out.println(string7);

        //3.9
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.next();
        if(text.toLowerCase().equals("запуск")){
            System.out.println("Запускаем процесс");
        }
        if(text.toLowerCase().equals("завершен")){
            System.out.println("Процесс завершен");
        }
        if(text.toLowerCase().equals("ошибка")){
            System.out.println("Произошла ошибка");
        }
        System.out.println(String.format("Вы ввели: <%s>", text));

        //4
        StringBuilder sb = new StringBuilder();

        sb.append(string1);
        sb.append(string2);
        sb.append(string3);
        sb.append(string4).append("\n");
        sb.append(string5);
        sb.append(string6);
        sb.append(string7);

        sb.reverse();

        String result = sb.toString();

        System.out.println(result);
    }

    public static void getThreeSymbols(String[] str){
        for (String element : str) {
            System.out.println(element.substring(0, 3));
        }

    }

    public static String getMaxLengthString(String[] str) {
        int index = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[index].length() < str[i].length()){
                index = i;
            }
        }
        return str[index];

    }
}
