package com.company;

import java.util.Arrays;




        public class Main {
            public static final String RED = "\u001B[31m";
            public static final String ANSI_YELLOW = "\u001B[33m";
            public static final String ANSI_BLUE = "\u001B[34m";
            public static final String ANSI_PURPLE = "\u001B[35m";
            public static final String ANSI_CYAN = "\u001B[36m";
            public static final String ANSI_RESET = "\u001B[0m";
            static   double[] num = {9,-1, 5.2, 5, 6, 7.56, 9, -6, -4, -8, -2.64, -4, -7.42, -3, 5, 4.88, 7, -8.9, -7.8 };
            static   boolean isSorted=false;
            static  int buf;
            public static void main(String[] args) {
                arrays();
                sortArrays();

            }

            private static void sortArrays() {
                while (!isSorted){
                    isSorted=true;
                    for (int i = 0; i < num.length - 1; i++) {
                        if (num[i]>num[i+1]){
                            isSorted=false;
                            buf= (int) num[i];
                            num[i]=num[i+1];
                            num[i+1]=buf;
                        } } }
                System.out.println(Arrays.toString(num)+ANSI_RESET);
            }


            private static void arrays() {
                System.out.println("Массив до преобразований:\n" + Arrays.toString(num)+ANSI_BLUE);
                int positiveCount = 0;
                double result = 0;
                for (int i = 0; i < num.length; i++) {
                    if ((i  > 0) && (num[i] > 0)) {
                        result += num[i];
                        positiveCount++;                 System.out.print(num[i] + " "+ANSI_BLUE);             }
                }
                if (positiveCount == 0) System.out.println("Нет отрицательных чисел!");
                else System.out.println("Среднее арифметическое нечетных отрицательных чисел: " + (result / positiveCount)+ANSI_PURPLE);
                System.out.println(5.2 +5.0 +6.0 +7.56 +9.0 +5.0+ 4.88 +7.0+ANSI_YELLOW);
                System.out.println(49.64/8+" 100% результат "+RED );
            } }

