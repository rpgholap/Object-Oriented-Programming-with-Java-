/*
9. Animal Sound
Scenario: You are building a zoo management system to play animal sounds.
Problem Statement:
Create a superclass Animal with method makeSound(). Subclass Dog and Cat override makeSound().
Classes/Fields:
● Animal → makeSound()
● Dog → “Bark”
● Cat → “Meow”
Sample Output:
Dog → Bark
Cat → Meow
*/

// Superclass
class Animal {
    // Method to be overridden by subclasses
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

// Main class to test
public class AnimalSound {
    public static void main(String[] args) {
        // Creating objects
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling overridden methods
        System.out.print("Dog → ");
        dog.makeSound();

        System.out.print("Cat → ");
        cat.makeSound();
    }
}
