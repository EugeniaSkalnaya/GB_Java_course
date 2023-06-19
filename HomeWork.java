//package ru.gb.lesson4;

package lesson4;

import java.io.FileNotFoundException;
import java.util.*;

public class HomeWork {

    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя и “запоминает” строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
     * 4. Если введено exit, то программа завершается
     * <p>
     * <p>
     * <p>
     * > - ввод в консоль (stdin), < - вывод на консоль (stdout)
     * > java
     * > python
     * > c#
     * > print
     * < [c#, python, java]
     * > revert
     * > print
     * < [python, java]
     * > revert
     * > revert
     * > print
     * < []
     * > revert -> throw new NoSuchElementException
     */
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        Stack<String> Stackstorage = new Stack<>();
        while (true) {
            String command = scanner.nextLine();
            if ("exit".equals(command)) {
                System.exit(0);
                break;
            }
            else if ("print".equals(command)) {
                if (Stackstorage.isEmpty()){
                    System.out.println("Здесь пусто");
                }
                Stack <String> tempStorage = new Stack<>();
                tempStorage.addAll(Stackstorage);
                while (!Stackstorage.isEmpty()) {
                    System.out.println(Stackstorage.pop());
                }
                Stackstorage.addAll(tempStorage);
            } else if ("revert".equals(command)) {
                Stackstorage.pop();
            } else {
                Stackstorage.push(command);
            }
        }
        }
}

