package Generics;

    public class ClassGenerics<T> {
        public String checkTheClass(T name){
            return name.getClass().getName();
        }

        public static void main(String[] args) {
            ClassGenerics<String>  nameStringClass = new ClassGenerics<>();
            ClassGenerics<Double>  nameDoubleClass = new ClassGenerics<>();

            String nameClassOne = nameStringClass.checkTheClass("Helicopter");
            String nameClassTwo = nameDoubleClass.checkTheClass(8.78);
            System.out.println(nameClassOne);
            System.out.println(nameClassTwo);
        }

    }


