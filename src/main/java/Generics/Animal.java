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

    public static class Whale extends Animal{

        public Whale(String typeAnimal, String colorAnimal) {
            super(typeAnimal, colorAnimal);
        }
    };
    public static class Dog extends Animal{

        public Dog(String typeAnimal, String colorAnimal) {
            super(typeAnimal, colorAnimal);
        }
    };
    public static class AnimalGenericInfo<T extends Animal> {
        public void BringOut(T animal) {
            System.out.println("Animal is " + animal.getTypeAnimal() + ". The color of this " +
                    animal.getTypeAnimal() + " " + animal.getColorAnimal() + ".");
        }

    };

    public static void main(String[] args) {
        Dog dog = new Dog("dog", "black");
        Whale whale = new Whale("whale", "blue");
        AnimalGenericInfo<Dog> infoDog = new AnimalGenericInfo<>();
        AnimalGenericInfo<Whale> infoWhole = new AnimalGenericInfo<>();
        infoDog.BringOut(dog);
        infoWhole.BringOut(whale);

    }
}

