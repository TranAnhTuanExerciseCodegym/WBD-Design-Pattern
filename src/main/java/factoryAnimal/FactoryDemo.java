package factoryAnimal;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = AnimalFactory.getAnimalFactory();
        AnimalFactory animalFactory1 = AnimalFactory.getAnimalFactory();

        System.out.println(animalFactory);
        System.out.println(animalFactory1);

        Animal animal1 = animalFactory.getAnimal("meo");
        System.out.println("animal1 sound: " + animal1.makeSound());

        Animal animal2 = animalFactory.getAnimal("canine");
        System.out.println("animal2 sound: " + animal2.makeSound());

    }
}
