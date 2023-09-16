package Generics;

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
        SumNumbers<Integer> sumNumbersInteger = new SumNumbers<>(arrayInteger);
        SumNumbers<Double> sumNumbersDouble = new SumNumbers<>(arrayDouble);
        sumNumbersInteger.sum();
        sumNumbersDouble.sum();
    }
}
