package Generics;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {



                Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};

                double sum = Arrays.stream(doubleArray)
                        .mapToDouble(Double::doubleValue) // Преобразование Double в double
                        .sum(); // Суммирование элементов

                System.out.println("Сумма элементов массива: " + sum);
            }
        }

    

