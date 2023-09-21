package Generics;

public class Animal {
    private String typeAnimal;
    private String colorAnimal;

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public String getColorAnimal() {
        return colorAnimal;
    }

    public Animal(String typeAnimal, String colorAnimal) {
        this.typeAnimal = typeAnimal;
        this.colorAnimal = colorAnimal;
    }

    public class Whale extends Animal{

        public Whale(String typeAnimal, String colorAnimal) {
            super(typeAnimal, colorAnimal);
        }
    };
    public class Dog extends Animal{

        public Dog(String typeAnimal, String colorAnimal) {
            super(typeAnimal, colorAnimal);
        }
    };
    public class AnimalGeneric<T extends Animal> {

    };

    public static void main(String[] args) {

    }
}

