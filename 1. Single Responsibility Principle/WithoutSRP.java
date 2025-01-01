// A single class handling both invoice generation and email notification
class Invoice {
    public void generateInvoice() {
        // Logic for generating an invoice
        System.out.println("Invoice generated.");
    }

    public void sendEmailNotification(String email) {
        // Logic for sending an email notification
        System.out.println("Email sent to: " + email);
    }
}

// Main class demonstrating the violation of SRP
public class WithoutSRP {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.generateInvoice();
        invoice.sendEmailNotification("customer@example.com");
    }
}
