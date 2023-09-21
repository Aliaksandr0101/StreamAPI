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
}
class Whale extends Animal{
    public Whale(String typeAnimal, String colorAnimal) {
        super(typeAnimal, colorAnimal);
    }
}
 class AnimalGenerics<T extends Animal>{
     public String bringOut(T animal){
         String infoAboutAnimal = "This is " + animal.getColorAnimal() + " " + animal.getTypeAnimal() + ".";
         return infoAboutAnimal;
     }
 }
  class MainTest{
      public static void main(String[] args) {
          Dog dog = new Dog("dog", "black");
          Whale whale = new Whale("whale", "blue");
          AnimalGenerics dogInfo = new AnimalGenerics();
          AnimalGenerics whaleInfo = new AnimalGenerics();
          System.out.println(dogInfo.bringOut(dog));
          System.out.println(whaleInfo.bringOut(whale));
      }

  }