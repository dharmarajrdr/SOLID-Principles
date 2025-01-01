// Large Interface with multiple responsibilities
interface Printer {

    void print();

    void scan();

    void fax();
}

// Printer class implementing unnecessary methods
class SimplePrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    // SimplePrinter doesn't need to scan or fax, but forcing to implement these methods -> Violates ISP
    @Override
    public void scan() {
        // Do nothing, since SimplePrinter doesn't support scanning
        throw new Error("SimplePrinter does not support scanning.");
    }

    @Override
    public void fax() {
        // Do nothing, since SimplePrinter doesn't support faxing
        throw new Error("SimplePrinter does not support faxing.");
    }
}

public class WithoutISP {

    public static void main(String[] args) {
        Printer printer = new SimplePrinter();
        printer.print();  // Works fine
        printer.scan();   // Unnecessary and violates ISP
        printer.fax();    // Unnecessary and violates ISP
    }
}
