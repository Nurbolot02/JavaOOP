package Lesson1.Geo;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);

        gt.append(vasya, irina);
        gt.append(vasya, vasya);

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));
        System.out.println(new Reserch(gt).spend(vasya,
                Relationship.parent));
    }

}
