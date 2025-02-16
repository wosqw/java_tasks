import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        // Задание 1. Четное или нечетное число

        System.out.print("Введите число: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.print("Оно четное.");
        }
        else {
            System.out.print("Оно нечетное.");
        }

        // Задание 2. Минимальное из трех чисел

        System.out.print("\nВведите три числа: ");
        int nums[] = new int [3];
        for (int i = 0; i < nums.length; i++){
            int num1 = sc.nextInt();
            nums[i] = num1;
        }
        System.out.print("Минимальное число: " + Arrays.stream(nums).min().getAsInt());

        // Задание 3. Таблица умножения

        System.out.print("\nТаблица умножения на 5: ");
        for (int i = 1; i < 11; i++){
            System.out.print("5 * " + i + " = " + 5*i + "\n");
        }

        // Задание 4. Сумма чисел от 1 до N

        System.out.print("Введите число N: ");
        int num2 = sc.nextInt();
        System.out.print("Числа от 1 до N: ");
        for (int i = 1; i < (num2 + 1); i++){
            System.out.print(i + "\n");
        }

        // Задание 5. Число Фибоначчи

        System.out.print("Введите число N: ");
        int num3 = sc.nextInt();
        int nums1[] = new int[num3];
        System.out.print("N числа Фибоначчи: ");
        for (int i = 0; i < num3; i++){
            if (i < 2){
                nums1[i] = i;
                continue;
            }
            nums1[i] = nums1[i-2] + nums1[i-1];
        }
        System.out.print(Arrays.toString(nums1));

        // Задание 6. Проверка простого числа

        System.out.print("\nВведите число: ");
        int num4 = sc.nextInt();
        int nums2[] = new int[3];
        nums2[0] = 1;
        nums2[1] = num4;
        nums2[2] = -1;
        for (int i = 2; i <= 50; i++) {
            if (i == num4)
                continue;
            else if (num4 % i == 0) {
                nums2[2] = i;
                System.out.print("Число непростое.\n");
                break;
            }
        }
        if (nums2[2] == -1)
            System.out.print("Число простое.\n");

        // Задание 7. Обратный порядок чисел

        System.out.println("Введите число N: ");
        int num5 = sc.nextInt();
        for (int i = num5; i >= 1; i--) {
            System.out.print(i + "\n");
        }

        // Задание 8. Сумма четных чисел

        System.out.print("Введите два числа: ");
        int num6 = sc.nextInt();
        int num7 = sc.nextInt();
        System.out.print("Четные числа между ними: ");
        for (int i = num6; i <= num7; i++) {
            if (i % 2 == 0){
                System.out.print(i + "\n");
            }
        }

        // Задание 9. Реверс строки

        System.out.print("Введите строку: ");
        String str = sc.next();
        String str1 = "";
        for (int i = (str.length() - 1); i > -1; i--) {
                str1 += str.charAt(i);
        }
        System.out.println(str1);

        // Задание 10. Количество цифр в числе

        System.out.print("\nВведите число: ");
        String str2 = sc.next();
        System.out.println("Число цифр в числе: " + str2.length());

        // Задание 11. Факториал числа

        System.out.print("\nВведите число: ");
        int num8 = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num8; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа: " + factorial);

        // Задание 12. Сумма цифр числа

        System.out.print("\nВведите число: ");
        String str3 = sc.next();
        int result = 0;
        for (int i = 0; i < str3.length(); i++) {
            result += Integer.parseInt(String.valueOf(str3.charAt(i)));
        }
        System.out.print("Сумма цифр в числе: " + result);

        // Задание 13. Палиндром

        System.out.print("\nВведите число: ");
        String str4 = sc.next();
        if (new StringBuilder(str4).reverse().toString() == str4){
            System.out.print("Это палиндром.");
        }
        else {
            System.out.print("Это не палиндром.");
        }

        // Задание 14. Найти максимальное число в массиве

        System.out.print("\nВведите размер массива: ");
        int num9 = sc.nextInt();
        int[] nums3 = new int[num9];
        int max = 0;
        for (int i = 0; i < nums3.length; i++) {
            System.out.print("Введите число: ");
            nums3[i] = sc.nextInt();
            if (nums3[i] > max) {
                max = nums3[i];
            }
        }
        System.out.print("Максимальное число: " + max);

        // Задание 15. Сумма всех элементов массива

        System.out.print("\nВведите размер массива: ");
        int num10 = sc.nextInt();
        int[] nums4 = new int[num10];
        int sum2 = 0;
        for (int i = 0; i < nums4.length; i++) {
            System.out.print("Введите число: ");
            nums4[i] = sc.nextInt();
            sum2 += nums4[i];
        }
        System.out.print("Сумма чисел: " + sum2);

        // Задание 16. Количество положительных и отрицательных чисел

        System.out.print("\nВведите размер массива: ");
        int nums11 = sc.nextInt();
        int[] nums5 = new int[nums11];
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < nums5.length; i++) {
            System.out.print("Введите числа: ");
            nums5[i] = sc.nextInt();
            if (nums5[i] >= 0) {
                pos += nums5[i];
            }
            else {
                neg += nums5[i];
            }
        }
        System.out.print("Количество положительных чисел: " + pos + ", Количество отричательных чисел: " + neg);

        // Задание 17. Простые числа в диапазоне

        System.out.print("Введите первое число A: ");
        int num12 = sc.nextInt();
        System.out.print("Введите второе число B: ");
        int num13 = sc.nextInt();
        System.out.println("Простые числа в диапазоне: ");
        for (int i = num12; i <= num13; i++) {
            if (i <= 1) {
                break;
            }
            for (int j = 2; j <= i / 2; i++) {
                if (j % i == 0) {
                    break;
                }
            }
            System.out.println(i);
        }

        // Задание 18. Подсчет гласных и согласных в строке

        System.out.print("Введите строку: ");
        String str5 = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str5.length(); i++) {
            char ch = str5.charAt(i);
            ch = Character.toLowerCase(ch);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Количество гласных: " + vowels);
        System.out.println("Количество согласных: " + consonants);

        // Задание 19. Перестановка слов в строке

        System.out.print("Введите строку: ");
        String str6 = sc.nextLine();
        String[] words = str6.split(" ");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        System.out.println("Перевернутая строка: " + reversed.trim());

        // Задание 20. Число Армстронга

        System.out.print("Введите число: ");
        int num14 = sc.nextInt();
        int originalNumber = num14;
        int sum3 = 0;
        int numDigits = String.valueOf(num14).length();

        while (num14 != 0) {
            int digit = num14 % 10;
            sum3 += Math.pow(digit, numDigits);
            num14 /= 10;
        }
        if (sum3 == originalNumber) {
            System.out.println(originalNumber + " является числом Армстронга.");
        } else {
            System.out.println(originalNumber + " не является числом Армстронга.");
        }
    }
}

