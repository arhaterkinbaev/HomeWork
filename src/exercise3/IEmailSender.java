package exercise3;

public interface IEmailSender extends IMessageSender {
    void sendEmail(String emailAddress, String message);
}
