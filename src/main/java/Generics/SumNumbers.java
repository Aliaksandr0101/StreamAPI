package Generics;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumNumbers<T extends Number> {
    private T [] arrayNumber;

    public SumNumbers(T[] arrayNumber) {
        this.arrayNumber = arrayNumber;
    }
   
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
        SumNumbers<Integer> sumNumbersInteger = new SumNumbers<>(arrayInteger);
        SumNumbers<Double> sumNumbersDouble = new SumNumbers<>(arrayDouble);
        SumNumbers<Long> sumNumbersLong = new SumNumbers<>(arrayLong);
        SumNumbers<Byte> sumNumbersByte = new SumNumbers<>(arrayByte);
        sumNumbersInteger.sum();
        sumNumbersDouble.sum();
        sumNumbersLong.sum();
        sumNumbersByte.sum();
    }
}
