package Generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoubleArray {
    public static void main(String[] args) {

                Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};

                double sum = Arrays.stream(doubleArray)
                        .mapToDouble(Double::doubleValue) // Преобразование Double в double
                        .sum(); // Суммирование элементов

                System.out.println("Сумма элементов массива: " + sum);


                List<Double> doubleList = Arrays.asList(23.43, 23.32, 8.76567);

                System.out.println("Contents of the list - " + doubleList);

                Stream<Double> doubleStream = doubleList.stream();

                double sumOfElements = doubleStream.collect(Collectors.summingDouble(e -> e));

                System.out.println("Sum of the stream - " + sumOfElements);

        String c = Stream.of("s", "u", "p", "e", "r").collect(Collectors.joining(" -> ", "[ ", " ]"));
        System.out.println(c);  // [ s -> u -> p -> e -> r ]

       /*public void SumTwo(){
            double sum = Arrays.stream(arrayNumber)
                    .mapToDouble(Double::doubleValue) // Преобразование Double в double
                    .sum();
            double sumTwo = Arrays.stream(arrayNumber).mapToDouble(e -> (double) e).sum();
            System.out.println("Sum elements array = " + sumTwo);

        }*/
            }
        }





