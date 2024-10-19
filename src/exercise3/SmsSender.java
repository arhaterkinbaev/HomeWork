package exercise3;

public class SmsSender implements ISmsSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Отправка SMS: " + message);
    }

    @Override
    public void sendSms(String phoneNumber, String message) {
        System.out.println("Отправка SMS на номер " + phoneNumber + ": " + message);
    }
}
