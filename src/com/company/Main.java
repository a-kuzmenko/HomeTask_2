package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ввести n чисел с консоли.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 2 to 10: ");
        int size = scanner.nextInt();
        int scanNumber [] = new int[size];


        GetArray(scanner, size, scanNumber);
        System.out.println("Ввести n чисел с консоли");
        ShowArray(scanNumber);

        //1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

        //2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
        System.out.println("Упорядочить и вывести числа в порядке возрастания");
        SortAscending(scanNumber);
        ShowArray(scanNumber);

        System.out.println("Упорядочить и вывести числа в порядке убывания");
        SortAscending(scanNumber);
        invert(scanNumber);
        ShowArray(scanNumber);

        //3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
        //4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти
        //первое из них.
        //5. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с
        //равным числом четных и нечетных цифр.
        //6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько,
        //найти первое из них.
        //7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из
        //них.
        //8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.

        System.out.print("Enter the number of lines from 2 to 10: ");
        int lines = scanner.nextInt();

        int scanMatrix [][] = new int[lines][lines];

        GetMatrix(scanner, lines, scanMatrix);

        //System.out.println(Arrays.toString(scanMatrix));
        //9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-
        //        тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-
        //        сел.
        //9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
        //9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо
        //(влево, вверх, вниз).
        //9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих
        //подряд.
        //9.4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными
        //элементами каждой строки.
        //9.5. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
        //9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
        //9.7. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.
        //9.8. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались
        //после всех остальных.




    }



    private static void GetMatrix(Scanner scanner, int lines, int[][] scanMatrix) {
        System.out.print("Enter " + lines + " integer(s): ");

        for(int i = 0; i < scanMatrix.length; i++){

            for (int j = 0; j < scanMatrix[i].length; j++) {

                scanMatrix[i][j] = scanner.nextInt();
                //System.out.print(scanMatrix[i][j] + " ");
            }

        }
    }


    private static void invert(int[] scanNumber) {
        for (int j = 0; j < scanNumber.length/2; j++) {
            int temp = scanNumber[j];
            scanNumber[j] = scanNumber[scanNumber.length - j - 1];
            scanNumber[scanNumber.length - j - 1] = temp;

        }

    }

    private static void GetArray(Scanner scanner, int size, int[] scanNumber) {
        System.out.print("Enter " + size + " integer(s): ");
        for(int i = 0; i < scanNumber.length; i++){
            scanNumber[i] = scanner.nextInt();
        }
    }

    private static void SortAscending(int[] scanNumber) {
        for (int i = scanNumber.length -1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {

                if(scanNumber[j] > scanNumber[j+1]) {
                    int temp = scanNumber[j];
                    scanNumber[j] = scanNumber[j+1];
                    scanNumber[j+1] = temp;
                }

            }

        }

    }

    private static void ShowArray(int[] scanNumber) {
        System.out.println(Arrays.toString(scanNumber));
    }
}
