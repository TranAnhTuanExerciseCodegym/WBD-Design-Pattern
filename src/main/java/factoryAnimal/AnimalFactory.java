package factoryAnimal;

class AnimalFactory {
    private AnimalFactory() {
    }

    private static AnimalFactory animalFactory = new AnimalFactory();

    static AnimalFactory getAnimalFactory() {
        System.out.println(animalFactory);
        return animalFactory;
    }


    Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
