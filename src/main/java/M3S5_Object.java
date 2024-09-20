/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * An example of Object Oriented Programming
 */

void main() {
    // Create an object of Pet type
    Pet bob = new Pet("Bob");

    // Interact with an object calling its methods
    bob.eat();
}

class Pet {
    // Private means that is not visible from the rest of the world
    private String name;
    private double weight;

    public Pet(String name) {
        this.name = name;
        this.weight = 5.0;
    }

    public void eat() {
        weight += 0.1;
        System.out.println(name + " is eating, now is weight is " + weight);
    }

    @Override
    public String toString() {
        return "[" + name + ", " + weight + "]";
    }
}
