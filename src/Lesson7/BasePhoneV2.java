package Lesson7;

public class BasePhoneV2 extends BasePhone implements Sms{
    public BasePhoneV2(String name, int id) {
        super(name, id);
    }
    @Override
    public void sendSms() {
        System.out.printf("%d %s - send sms\n", this.getId(), this.getName());
    }
}
