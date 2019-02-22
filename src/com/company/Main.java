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
        int numbers[] = new int[size];

        GetArray(scanner, size, scanNumber);
        ShowArray(scanNumber);

        //1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        GetLengthEachNumber(scanNumber, numbers);
        ShowLength(numbers);
        SMallBigNumber(size, scanNumber, numbers);

        //2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
        System.out.println("Упорядочить и вывести числа в порядке возрастания");
        SortAscending(scanNumber);
        ShowArray(scanNumber);

        System.out.println("Упорядочить и вывести числа в порядке убывания");
        SortAscending(scanNumber);
        invert(scanNumber);
        ShowArray(scanNumber);

        //3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
        float value = 0;
        for (int i = 0; i < size; i++) {
            value = value + numbers[i];
        }
        value = value / size;
        System.out.println();
        System.out.print("Числа, длина которых меньше средней: ");
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (value > numbers[i]) {
                System.out.println("Число: " + scanNumber[i] + "." + " Его длина: " + numbers[i] + ";");
                System.out.println();
            }
        }
        System.out.print("Числа, длина которых больше средней: ");
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (value < numbers[i]) {
                System.out.println("Число: " + scanNumber[i] + "." + " Его длина: " + numbers[i] + ";");
            }
        }
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

        int[][] workArray = new int[lines][lines];
        int a = 0;

        for (int i = 0; i < lines; i++)
        {
            for (int j = 0; j < lines; j++) {
                a++;
                workArray[i][j] = a;
                System.out.print(workArray[i][j] + " ");
            }
            System.out.println();

        }

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

    private static void SMallBigNumber(int size, int[] scanNumber, int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int big = 0, small = 0, number_lenght = 0;
        for (int i = 0; i < size; i++) {
            //min = Math.min(min,numbers[i]);
           // max = Math.max(max,numbers[i]);

            number_lenght = numbers[i];
            if (min > number_lenght) {
                min = number_lenght;
                small = i;
            } else {
                if (max < number_lenght) {
                    max = number_lenght;
                    big = i;
                }
            }

        }

        System.out.println("The smallest number - " + scanNumber[small] + " the length is - " + min);
        System.out.println("The biggest number - " + scanNumber[big] + " the length is - " + max);
    }

    private static void ShowLength(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    private static void GetLengthEachNumber(int[] scanNumber, int[] numbers) {
        for (int i = 0; i < scanNumber.length; i++) {
            numbers[i] = (scanNumber[i] + "").length();

        }
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
