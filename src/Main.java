import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

//        // Задание 1
//
//        System.out.print("Введите число: ");
//        int num = sc.nextInt();
//        if (num % 2 == 0){
//            System.out.print("Оно четное.");
//        }
//        else {
//            System.out.print("Оно нечетное.");
//        }
//
//        // Задание 2
//
//        System.out.print("\nВведите три числа: ");
//        int nums[] = new int [3];
//        for (int i = 0; i < nums.length; i++){
//            int num1 = sc.nextInt();
//            nums[i] = num1;
//        }
//        System.out.print("Минимальное число: " + Arrays.stream(nums).min().getAsInt());
//
//        // Задание 3
//
//        System.out.print("\nТаблица умножения на 5: ");
//        for (int i = 1; i < 11; i++){
//            System.out.print("5 * " + i + " = " + 5*i + "\n");
//        }
//
//        // Задание 4
//
//        System.out.print("Введите число N: ");
//        int num2 = sc.nextInt();
//        System.out.print("Числа от 1 до N: ");
//        for (int i = 1; i < (num2 + 1); i++){
//            System.out.print(i + "\n");
//        }
//
//        // Задание 5
//
//        System.out.print("Введите число N: ");
//        int num3 = sc.nextInt();
//        int nums1[] = new int[num3];
//        System.out.print("N числа Фибоначчи: ");
//        for (int i = 0; i < num3; i++){
//            if (i < 2){
//                nums1[i] = i;
//                continue;
//            }
//            nums1[i] = nums1[i-2] + nums1[i-1];
//        }
//        System.out.print(Arrays.toString(nums1));
//
//        // Задание 6
//
//        System.out.print("\nВведите число: ");
//        int num4 = sc.nextInt();
//        int nums2[] = new int[3];
//        nums2[0] = 1;
//        nums2[1] = num4;
//        nums2[2] = -1;
//        for (int i = 2; i <= 50; i++) {
//            if (i == num4)
//                continue;
//            else if (num4 % i == 0) {
//                nums2[2] = i;
//                System.out.print("Число непростое.\n");
//                break;
//            }
//        }
//        if (nums2[2] == -1)
//            System.out.print("Число простое.\n");
//
//        // Задание 7
//
//        System.out.println("Введите число N: ");
//        int num5 = sc.nextInt();
//        for (int i = num5; i >= 1; i--) {
//            System.out.print(i + "\n");
//        }
//
//        // Задание 8
//
//        System.out.print("Введите два числа: ");
//        int num6 = sc.nextInt();
//        int num7 = sc.nextInt();
//        System.out.print("Четные числа между ними: ");
//        for (int i = num6; i <= num7; i++) {
//            if (i % 2 == 0){
//                System.out.print(i + "\n");
//            }
//        }
//
//        // Задание 9
//
//        System.out.print("Введите строку: ");
//        String str = sc.next();
//        String str1 = "";
//        for (int i = (str.length() - 1); i > -1; i--) {
//                str1 += str.charAt(i);
//        }
//        System.out.println(str1);
//
//        // Задание 10
//
//        System.out.print("\nВведите число: ");
//        String str2 = sc.next();
//        System.out.println("Число цифр в числе: " + str2.length());
//
//        // Задание 11
//
//        System.out.print("\nВведите число: ");
//        int num8 = sc.nextInt();
//        int factorial = 1;
//        for (int i = 1; i <= num8; i++) {
//            factorial *= i;
//        }
//        System.out.println("Факториал числа: " + factorial);

        // Задание 12

        System.out.print("\nВведите число: ");
        String str3 = sc.next();
        int result = 0;
        for (int i = 0; i < str3.length(); i++) {
            result += Integer.parseInt(String.valueOf(str3.charAt(i)));
        }
        System.out.print("Сумма цифр в числе: " + result);

        // Задание 13

        System.out.print("\nВведите число: ");
        String str4 = sc.next();
        if (new StringBuilder(str4).reverse().toString() == str4){
            System.out.print("Это палиндром.");
        }
        else {
            System.out.print("Это не палиндром.");
        }

        // Задание 14

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

        // Задание 15

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

        // Задание 16

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

        // Задание 17

        System.out.print("\nВведите два числа: ");
        int num12 = sc.nextInt();
        int num13 = sc.nextInt();
        ArrayList<String> nums6 = new ArrayList<String>();
        for (int i = num12; i <= num13; i++) {
            nums6.add(String.valueOf(i));
            for (int j = 2; j <= i; j++) {
                if (i == j){
                    continue;
                }
                else if (i % j == 0) {
                    nums6.remove(String.valueOf(j));
                    continue;
                }
            }
        }
        System.out.print("Простые числа в диапазоне: " + nums6);
    }
}
