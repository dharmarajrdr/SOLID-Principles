
class Bird {

    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Ostrich extends Bird {

    @Override
    public void fly() {
        // Ostriches can't fly!
        throw new UnsupportedOperationException("Ostriches cannot fly.");
    }
}

public class WithoutLSP {

    public static void main(String[] args) {
        Bird bird = new Ostrich();
        bird.fly();  // Throws an exception
    }
}
