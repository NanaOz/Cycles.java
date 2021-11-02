package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task12();
    }


    public static void task1() {
        int A, B;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        int result = 1;
        for (int i = 1; i <= B; i++) {
            result *= A;
            System.out.println(result);
        }
    }

    public static void task2() {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        for (int i = 1; i < 1001; i++) {
            if (i % A == 0) {
                System.out.println(i + "");
            }
        }
    }

    public static void task3() {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int result = 0;
        for (int i = 1; i <= Math.sqrt(A); i++) {
            result++;
        }
        System.out.println(result);
    }

    public static void task4() {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();

        for (int i = 1; i < (A / 2); i++) {

            if (A % 1 == 0) {
                int result = 1;
                System.out.println(result);
            }
        }
    }

    public static void task5() {
        // write your code here
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int sum = 0;
        for (int i = A; i <= B; i++) {
            int C = 7;
            if (i % C == 0) {
                sum += i;
            }
            System.out.println();
        }
    }

    public static void task6() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int nFibo1 = 1;
        int nFibo2 = 1;
        int c;
        if (N <= 2) {
            System.out.println("1");
        }
        else {
            for (int i = 3; i <= N; i++) {
                c = nFibo2 + nFibo1;
                nFibo1 = nFibo2;
                nFibo2 = c;
            }
            System.out.println(nFibo2);
        }
    }

    public static void task7() {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        while (B != 0) {
            int C = B;
            B = A % B;
            A = C;
        }
        System.out.println(A);
    }

    public static void task8() {
        Scanner in = new Scanner(System.in);
        double x = in.nextInt();
        double result = 0;
        double a = 1;
        int i = 1;
        while (a > x) {
            result += a;
            i++;
            a = 1.0 / (i * i);
        }
        System.out.println(result);
    }

    public static void task9() {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        for (int i = 0; i <= A; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    public static void task10() {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        while (A > 0) {
            int b = A % 10;
            A = A / 10;
            System.out.println(b);
        }
    }

    public static void task11() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i;
        for (i = 1; i <= N; i++) {
            int sum1 = 0, sum2 = 0;
            if (i % 2 == 0) {
                sum1 += i;
            }
            else
                sum2 += i;
            if (sum1 > sum2) {
                System.out.println(sum1);
            }
        }
    }

    public static void task12() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int a1 = a, b1 = b;
        boolean equal = false;
        while (a1 > 9) {
            int a2 = a1 % 10;
            a1 = a1 / 10;
            b1 = b;
            while (b1 > 9) {
                int b2 = b1 % 10;
                b1 = b1 / 10;
                if (a2 == b2) equal = true;
            }
            if (a2 == b1) equal = true;
        }
        b1 = b;
        while (b1 > 9) {
            int b2 = b1 % 10;
            b1 = b1 / 10;
            if (a1 == b2) equal = true;
        }
        if (equal == true) System.out.println("ДА");
        else System.out.println("НЕТ");

    }


    public static void task13() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите натуральное n:");
        int n = in.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (1 + 1.0 / (i * i));
        System.out.println("Результат = " + sum);
    }

    public static void task14() {
        System.out.println("Введите x, n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double x = in.nextInt();
        double carrent, prev = 1, sum = 0;
        for (int i = 0; i <= n; i++) {
            carrent = prev / (x + i);
            sum += carrent;
            prev = carrent;
        }
        System.out.println(sum);
    }

    public static void task15() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите натуральное n:");
        int n = in.nextInt();
        double P = 1;
        double sum = 0;
        double f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
            P *= (1 + 1.0 / f);
            sum += ((1 + i) / f);
        }
        System.out.println(P);
        System.out.println(sum);

    }

    public static void task16() {
        Scanner in = new Scanner(System.in);
        double x = in.nextInt();
        double result = 0;
        double a = 1;
        int i = 1;
        while (a > x) {
            result += a;
            i++;
            a = 1.0 / (i * i);
        }
        System.out.println(result);

    }

    public static void task17() {
        Scanner in = new Scanner(System.in);
        for (int i = 10; i <= 99; i++) {
            boolean flag = true;
            int sum = 0;
            int a = i;
            while (a != 0) {
                sum += a % 10;
                a = a / 10;
            }
            for (int f = 2; f <= 9; f++) {
                int sum2 = 0;
                int z = i * f;
                while (z != 0) {
                    sum2 += z % 10;
                    z = z / 10;

                }
                if (sum != sum2) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(i);
            }

        }
    }


    public static void task18() {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3;
        int number;
        for (int i = 1; i < 9; i++) {
            num1 = 1;
            for (int t = 2; t <= i; t++)
                num1 *= t;
            for (int j = 0; j < 9; j++) {
                num2 = 1;
                for (int t = 2; t <= j; t++)
                    num2 *= t;
                for (int k = 0; k < 9; k++) {
                    num3 = 1;
                    for (int t = 2; t <= k; t++)
                        num3 *= t;
                    number = 100 * i + 10 * j + k;
                    if (num1 + num2 + num3 == number) {
                        System.out.println(number);

                    }
                }
            }
        }
    }


    public static void task19() {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        for (int i = 1; i <= M; i++) {
            for (int a = 1; a < M; a++) {
                if ((i * i) + (a * a) == M) {
                    System.out.println(i + " " + a);
                }
            }
        }
    }

    public static void task20() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n) {
            System.out.println(true);
        }
        else
            System.out.println(false);

    }

    public static int countDigits(int a) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        while (a != 0) {
            result++;
            a /= 10;
        }
        return result;
    }

    public static void task21() {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int count = 0;
        int i = 1;
        while (count < k) {
            System.out.print(i);
            count += countDigits(i);
            i++;
        }
        System.out.println(((i - 1) / (Math.pow(10, count - k) % 10)));
    }

    public static void task22() {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int count = 1;
        String s = "";
        for (int i = 1; i <= k; i++) {
            count = i * i;
            s += count;
        }
        System.out.println(s);
        System.out.println(s.charAt(k - 1));
    }

    public static void task23() {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int a = 1, b = 0;
        String s = "1";
        for (int i = 2; i <= k; i++) {
            a += b;
            s += a;
            b = a - b;
        }
        System.out.println(s);
        System.out.println(s.charAt(k - 1));
    }
}