package Test.Lesson1;

public class RobotProgramm {
    public static void main(String[] args) {
        Robot1 robot1 = new Robot1();

        robot1.startBios();
        robot1.startOs();
        robot1.sayHello();

        robot1.work();
        robot1.work();
        robot1.work();

        robot1.stopWork();
        robot1.sayBye();
        robot1.stopOs();
        robot1.stopBios();
    }
}
