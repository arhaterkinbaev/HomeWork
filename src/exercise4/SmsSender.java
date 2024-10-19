package exercise4;

public class SmsSender implements INotificationSender {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
