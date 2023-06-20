class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        boolean isDog = animal instanceof Dog;
        System.out.println(isDog);
    }
}
