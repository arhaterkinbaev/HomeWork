package exercise3;

public class Main3 {

    public static void main(String[] args) {
        ISmsSender smsSender = new SmsSender();
        smsSender.sendMessage("Привет!");
        smsSender.sendSms("+1234567890", "Важное сообщение!");

        IEmailSender emailSender = new EmailSender();
        emailSender.sendMessage("Здравствуйте!");
        emailSender.sendEmail("test@example.com", "Сообщение по электронной почте");
    }
}
