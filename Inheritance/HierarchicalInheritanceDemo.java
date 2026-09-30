// Parent class
class Animal {
    void eat() {
        System.out.println("Hi i am from Animal Family and I like food.");
    }
}

// Child class 1 derived from its parent class Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Hey I am from dog family and i bark when i grow up");
    }
}
// Grandchild class derived from Dog class (Child class 1
class Puppy extends Dog {
    void weep() {
        System.out.println(" Hi i am a baby dog .. puppy and i weeps.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("I am from Cat family and the cat can meows.");
    }
}

// Grandchild class derived from Cat (Child class 2)
class Kitten extends Cat {
    void weep() {
        System.out.println("Hi i am a babay cat and i cant mew loudly .");
    }
}


public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        Puppy p= new Puppy();
	p.weep();//own method
	p.bark();//derived from parentclass (Classline 1)
	p.eat();//Derived from grandparent class(common for all class line) 
        
        Kitten k= new Kitten();
	k.weep();//own method
	k.meow();//accessing from parent class( classline 2)
	k.eat();// Derived from grandparent class(common for all class line) 
     
     
    }
}
