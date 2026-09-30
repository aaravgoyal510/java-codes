// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Interface
interface Pet {
    void play();
}

// Subclass that extends Animal and implements Pet
class Dog extends Animal implements Pet {
    @Override
    public void play() {
        System.out.println("The dog plays with a ball.");
    }
    
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultipleInheritanceDemo2 {
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        Dog dog = new Dog();
        dog.eat(); // Method from Animal superclass
        dog.play(); // Method from Pet interface
        dog.bark(); // Method in Dog class
    }
}
