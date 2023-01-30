package Animal;
public class Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        System.out.println(cat.say());
        Dog dog = new Dog();
        System.out.println(dog.say());
        Duck duck = new Duck();
        System.out.println(duck.say());

    }
}
