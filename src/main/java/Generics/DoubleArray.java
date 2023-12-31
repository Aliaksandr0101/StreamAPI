package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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

        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        Stream stream = list.stream();

        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10)
                .limit(3).forEach(System.out::print);
        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count = 0;
        for (int x : arr) {
            if (x >= 90) continue;
            x += 10;
            count++;
            if (count > 3) break;
            System.out.print(x);
        }

            }
        }







