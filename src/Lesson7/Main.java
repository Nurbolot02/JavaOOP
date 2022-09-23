package Lesson7;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StationaryPhone> stationaryPhones = new LinkedList<>();
        List<MobilePhone> mobilePhones = new LinkedList<>();
        List<SmartPhone> smartPhones = new LinkedList<>();

        stationaryPhones.add(new StationaryPhoneV1("StationaryPhoneV1", 1));
        stationaryPhones.add(new StationaryPhoneV1("StationaryPhoneV1", 2));

        //stationaryPhones.add(new Iphone("Iphone14", 1));

        mobilePhones.add(new Nokia("Nokia 3310", 1));
        mobilePhones.add(new Nokia("Nokia 5311", 2));
        mobilePhones.add(new Symbian("Symbian", 1));
        mobilePhones.add(new Symbian("Symbian", 2));

        //mobilePhones.add(new Iphone("Iphone14", 1));

        smartPhones.add(new Iphone("Iphone14", 1));
        smartPhones.add(new Iphone("Iphone14", 2));
        smartPhones.add(new Iphone("Iphone13", 1));
        smartPhones.add(new Iphone("Iphone13", 2));

        smartPhones.add(new Samsung("Samsung s10", 1));
        smartPhones.add(new Samsung("Samsung s10", 2));
        smartPhones.add(new Samsung("Samsung s20", 1));
        smartPhones.add(new Samsung("Samsung s20", 2));

        //smartPhones.add(new Symbian("Symbian", 2));

        for (StationaryPhone stationaryPhone : stationaryPhones) {
            stationaryPhone.call();
            System.out.println();
        }
        System.out.println("**********************");
        for (MobilePhone mobilePhone : mobilePhones) {
            mobilePhone.call();
            mobilePhone.sendSms();
            System.out.println();
        }
        System.out.println("**********************");
        for (SmartPhone smartPhone : smartPhones) {
            smartPhone.call();
            smartPhone.sendSms();
            smartPhone.sendEmail();
            System.out.println();
        }
    }
}
