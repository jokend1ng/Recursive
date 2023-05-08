package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static boolean recursion(int n, int i) {
        int sum=0;
        // i- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (n < 2) {
            return false;
        } // Базовый случай
        else if (n == 2) {
            return true;
        } // Базовый случай
        else if (n % i == 0) {
            return false;
        } // Шаг рекурсии / рекурсивное условие
        else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum=0;
        for (int i = 0, j = 0; j < 10; i++) {
            if (recursion(i, 2)) {
                arr[j] = i;
                j++;
                sum+=i;
            }

        }

        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
