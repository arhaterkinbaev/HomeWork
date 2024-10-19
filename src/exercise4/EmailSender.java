package exercise4;

public class EmailSender implements INotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
