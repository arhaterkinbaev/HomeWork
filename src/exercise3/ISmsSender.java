package exercise3;

public interface ISmsSender extends IMessageSender {
    void sendSms(String phoneNumber, String message);
}
