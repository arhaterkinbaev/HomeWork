package exercise4;

import java.util.List;

public class NotificationService {
    private final List<INotificationSender> senders;

    public NotificationService(List<INotificationSender> senders) {
        this.senders = senders;
    }

    public void sendNotification(String message) {
        for (INotificationSender sender : senders) {
            sender.send(message);
        }
    }
}
