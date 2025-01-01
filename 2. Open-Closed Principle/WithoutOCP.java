
class InvoiceProcessor {

    public void processInvoice(String type) {
        switch (type) {
            case "PDF": {
                System.out.println("Processing PDF invoice...");
                break;
            }
            case "Email": {
                System.out.println("Processing Email invoice...");
                break;
            }
            default: {
                throw new IllegalArgumentException("Unsupported invoice type: " + type);
            }
        }
    }
}

public class WithoutOCP {

    public static void main(String[] args) {
        InvoiceProcessor processor = new InvoiceProcessor();
        processor.processInvoice("PDF");
        processor.processInvoice("Email");
        processor.processInvoice("SMS"); // Will throw an exception
    }
}
