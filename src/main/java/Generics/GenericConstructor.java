package Generics;

public class GenericConstructor<T,V> {
    public GenericConstructor(T elementT, V elementV) {
        if (elementT.getClass().isInstance(elementV)){
            System.out.println("The classes coincided");
        } else {
            System.out.println("The classes is not match");
        }
    }

    public static void main(String[] args) {
         GenericConstructor<String, String> GenericOne = new GenericConstructor<>("Car", "Elephant");
         GenericConstructor<String, Double> GenericTwo = new GenericConstructor<>("Car", 78.7);
    }
}
