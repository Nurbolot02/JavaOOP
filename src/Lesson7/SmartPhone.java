package Lesson7;

public class SmartPhone extends BasePhoneV2 implements Email{
    public SmartPhone(String name, int id) {
        super(name, id);
    }

    @Override
    public void sendEmail() {
        System.out.printf("%d %s - send email\n", this.getId(), this.getName());
    }
}
