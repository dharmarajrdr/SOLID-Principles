// Class focusing only on invoice generation
class InvoiceGenerator {
    public void generateInvoice() {
        // Logic for generating an invoice
        System.out.println("Invoice generated.");
    }
}

// Class focusing only on email notifications
class EmailNotifier {
    public void sendEmail(String email) {
        // Logic for sending an email notification
        System.out.println("Email sent to: " + email);
    }
}

// Main class demonstrating adherence to SRP
public class WithSRP {
    public static void main(String[] args) {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        EmailNotifier emailNotifier = new EmailNotifier();

        invoiceGenerator.generateInvoice();
        emailNotifier.sendEmail("customer@example.com");
    }
}
