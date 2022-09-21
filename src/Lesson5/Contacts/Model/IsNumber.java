package Lesson5.Contacts.Model;

public class IsNumber {
    public static boolean isNumber(String str){
        try {
            Integer.parseInt(str);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
