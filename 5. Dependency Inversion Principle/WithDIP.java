// Abstraction for notification sender
interface NotificationSender {

    void send(String message);
}

// Low-level module: Email service implementing the abstraction
class EmailService implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}

// Low-level module: SMS service implementing the abstraction
class SMSService implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// High-level module: Notification service depending on abstraction
class NotificationService {

    private NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;  // Dependency injected via constructor
    }

    public void notifyUser(String message) {
        notificationSender.send(message);  // Using the abstraction
    }
}

public class WithDIP {

    public static void main(String[] args) {
        // Injecting the dependency (Email or SMS)
        NotificationSender emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.notifyUser("Welcome to our service!");

        // Changing dependency to SMS service
        NotificationSender smsService = new SMSService();
        notificationService = new NotificationService(smsService);
        notificationService.notifyUser("Your OTP is 1234.");
    }
}
