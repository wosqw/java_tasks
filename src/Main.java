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

        // Задание 6

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

        // Задание 7

        System.out.println("Введите число N: ");
        int num5 = sc.nextInt();
        for (int i = num5; i >= 1; i--) {
            System.out.print(i + "\n");
        }

        // Задание 8

        System.out.print("Введите два числа: ");
        int num6 = sc.nextInt();
        int num7 = sc.nextInt();
        System.out.print("Четные числа между ними: ");
        for (int i = num6; i <= num7; i++) {
            if (i % 2 == 0){
                System.out.print(i + "\n");
            }
        }

        // Задание 9

        System.out.print("Введите строку: ");
        String str = sc.next();
        String str1 = new String();
        for (int i = (str.length() - 1); i > -1; i--) {
                str1 += str.charAt(i);
        }
        System.out.println(str1);

        // Задание 10

        
    }
}
