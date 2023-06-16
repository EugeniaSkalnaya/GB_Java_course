/**
 * Пусть дан произвольный список целых чисел.
 *
 * 1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
 * 2) Найти минимальное значение         (Integer findMin(ArrayList<Integer> list))
 * 3) Найти максимальное значение
 * 4) Найти среднее значение
 *
 * То есть, нужно реализовать 4 метода, каждый из которых принимает список целых чисел, и делает свою работу.
 */
package Homework03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 5, 6, 8, 9, 3, 4, 0, 7, 11, 20)) ;
        System.out.println(findMin(numbers));
        System.out.println(findMax(numbers));
        System.out.println(findAverage(numbers));
        removeEven(numbers);
        System.out.println(numbers);
    }
        public static void removeEven (ArrayList<Integer> list) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) {
                    list.remove(i);
                }
            }
        }
    public static Integer findMin(ArrayList<Integer> list) {
        return Collections.min(list);
    }
    public static Integer findMax(ArrayList<Integer> list) {
        return Collections.max(list);
    }
    public static Double findAverage(ArrayList<Integer> list) {
        double sum = 0;
        for (Integer next : list) {
            sum += next;
        }
        return sum / list.size();
    }
    }

