package exercise3;

public class EmailSender implements IEmailSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Отправка email: " + message);
    }

    @Override
    public void sendEmail(String emailAddress, String message) {
        System.out.println("Отправка email на адрес " + emailAddress + ": " + message);
    }
}
