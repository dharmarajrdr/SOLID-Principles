// Base class for birds
class Bird {

    public void eat() {
        System.out.println("Bird is eating.");
    }
}

// Subclass for flying birds
class FlyingBird extends Bird {

    public void fly() {
        System.out.println("Flying bird is flying.");
    }
}

// Subclass for non-flying birds
class NonFlyingBird extends Bird {

    // No fly method here, as this class represents non-flying birds
    public void walk() {
        System.out.println("Non-flying bird is walking.");
    }
}

public class WithLSP {

    public static void main(String[] args) {
        Bird sparrow = new FlyingBird();
        Bird ostrich = new NonFlyingBird();

        sparrow.eat();
        ((FlyingBird) sparrow).fly();  // Specific to flying birds

        ostrich.eat();
        ((NonFlyingBird) ostrich).walk();  // Specific to non-flying birds
    }
}
