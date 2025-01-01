// High-level module directly depends on low-level module
class EmailService {

    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

class NotificationService {

    private EmailService emailService;

    public NotificationService() {
        emailService = new EmailService();  // Direct dependency on EmailService
    }

    public void notifyUser(String message) {
        emailService.sendEmail(message);  // Directly calling method on EmailService
    }
}

public class WithoutDIP {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.notifyUser("Welcome to our service!");
    }
}
