package Generics;

class Animal{
    private String typeAnimal;
    private String colorAnimal;

    public Animal(String typeAnimal, String colorAnimal) {
        this.typeAnimal = typeAnimal;
        this.colorAnimal = colorAnimal;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public String getColorAnimal() {
        return colorAnimal;
    }
}
class Dog extends Animal{
    public Dog(String typeAnimal, String colorAnimal) {
        super(typeAnimal, colorAnimal);
    }
};
class Whale extends Animal{
    public Whale(String typeAnimal, String colorAnimal) {
        super(typeAnimal, colorAnimal);
    }
};