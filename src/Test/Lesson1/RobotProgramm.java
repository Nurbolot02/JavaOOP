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


        System.out.println("\nRobot2");
        Robot2 robot2 = new Robot2();
        robot2.getInfo();
        robot2.setName("Alfred");
        robot2.addLevel();
        robot2.getInfo();

        for (int i = 0; i < 5; i++) {
            robot2.work();
        }

        robot2.powerOn();
        for (int i = 0; i < 5; i++) {
            robot2.work();
        }
        robot2.powerOff();
        for (int i = 0; i < 5; i++) {
            robot2.work();
        }
        robot2.powerOff();


    }
}
