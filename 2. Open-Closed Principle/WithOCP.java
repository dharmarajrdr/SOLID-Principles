// Base interface for invoice processing
interface Invoice {
    void process();
}

// Class for processing PDF invoices
class PDFInvoice implements Invoice {
    @Override
    public void process() {
        System.out.println("Processing PDF invoice...");
    }
}

// Class for processing Email invoices
class EmailInvoice implements Invoice {
    @Override
    public void process() {
        System.out.println("Processing Email invoice...");
    }
}

// Invoice Processor that works with any Invoice type
class InvoiceProcessor {
    public void processInvoice(Invoice invoice) {
        invoice.process();
    }
}

public class WithOCP {
    public static void main(String[] args) {
        InvoiceProcessor processor = new InvoiceProcessor();

        Invoice pdfInvoice = new PDFInvoice();
        Invoice emailInvoice = new EmailInvoice();

        processor.processInvoice(pdfInvoice);
        processor.processInvoice(emailInvoice);

        // To add new invoice types (e.g., SMSInvoice), no changes to existing classes are needed!
    }
}