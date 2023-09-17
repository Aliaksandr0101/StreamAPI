package Generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumNumbers<T extends Number> {
    private T [] arrayNumber;

    public SumNumbers(T[] arrayNumber) {
        this.arrayNumber = arrayNumber;
    }

/*public void SumTwo(){
    double sum = Arrays.stream(arrayNumber)
            .mapToDouble(Double::doubleValue) // Преобразование Double в double
            .sum();
        double sumTwo = Arrays.stream(arrayNumber).mapToDouble(e -> (double) e).sum();
    System.out.println("Sum elements array = " + sumTwo);

     }*/

    public void sum() {
        double sumArray = 0.0;

        for (T element : arrayNumber){
            sumArray += element.doubleValue();
        }
        System.out.println("Sum elements array = " + sumArray);
    }

    public static void main(String[] args) {
        Integer [] arrayInteger = {2, 7, 8, 1, 4};
        Double [] arrayDouble = {2.2, 7.0, 4.7, 2.2, 1.3};
        Byte [] arrayByte = {2, 7, 8, 1, 4, 8};
        Long [] arrayLong = {456L, 13L, 78L, 45L};
        Float [] arrayFloat = {1.F, 2.F, 3.F, 4.F, 5.F};
        SumNumbers<Integer> sumNumbersInteger = new SumNumbers<>(arrayInteger);
        SumNumbers<Double> sumNumbersDouble = new SumNumbers<>(arrayDouble);
        SumNumbers<Long> sumNumbersLong = new SumNumbers<>(arrayLong);
        SumNumbers<Byte> sumNumbersByte = new SumNumbers<>(arrayByte);
        SumNumbers<Float> sumNumbersFloat = new SumNumbers<>(arrayFloat);
        sumNumbersInteger.sum();
        sumNumbersDouble.sum();
        sumNumbersLong.sum();
        sumNumbersByte.sum();
        sumNumbersFloat.sum();


    }
}
