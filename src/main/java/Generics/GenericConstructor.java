package Generics;

public class GenericConstructor<T,V> {
    public GenericConstructor(T elementT, V elementV) {
        if (elementT.getClass() == elementV.getClass()){
            System.out.println("The classes coincided");
        } else {
            System.out.println("The classes is not match");
        }
    }
}
