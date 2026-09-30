// First interface
interface Animal {
    void eat();
}

// Second interface
interface Pet {
    void play();
}

// Implementing both interfaces
class Dog implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("The dog eats food.");
    }
    
    @Override
    public void play() {
        System.out.println("The dog plays with a ball.");
    }
}

public class MultipleInheritanceDemo1 {
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        Dog dog = new Dog();
        dog.eat(); // Method from Animal interface
        dog.play(); // Method from Pet interface
    }
}
