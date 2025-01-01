// Separate, focused interfaces
interface Printer {

    void print();
}

interface Scanner {

    void scan();
}

interface Fax {

    void fax();
}

// Printer class only needs to implement Printer interface
class SimplePrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}

// MultiFunctionPrinter class implements all relevant interfaces
class MultiFunctionPrinter implements Printer, Scanner, Fax {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing document...");
    }
}

public class WithISP {

    public static void main(String[] args) {
        Printer printer = new SimplePrinter();
        printer.print();  // Works fine

        // MultiFunctionPrinter can be used if we need scanning and faxing
        MultiFunctionPrinter multiPrinter = new MultiFunctionPrinter();
        multiPrinter.print();  // Works fine
        multiPrinter.scan();   // Works fine
        multiPrinter.fax();    // Works fine
    }
}
