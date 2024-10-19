package exercise4;

import exercise4.EmailSender;
import exercise4.INotificationSender;
import exercise4.NotificationService;
import exercise4.SmsSender;

import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        INotificationSender emailSender = new EmailSender();
        INotificationSender smsSender = new SmsSender();

        List<INotificationSender> senders = List.of(emailSender, smsSender);

        NotificationService notificationService = new NotificationService(senders);
        notificationService.sendNotification("Привет мир!");
    }
}
