package Lesson1.LoL;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {


        // Герой - герой ли?
        // #region teams

        int teamCount = 10;
        Random rand = new Random();

        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    teams.add(new Priest());
                    break;
                case 1:
                    teams.add(new Magician());
                    break;
                case 2:
                    teams.add(new Druid());
                    break;
                case 3:
                    teams.add(new Doctor());
                    break;
                default:
                    teams.add(new BaseHero());
                    break;
            }
            System.out.println(teams.get(i).getInfo());

        }

        System.out.println();

        // #endregion
        // #region

        BaseHero hero = new BaseHero(); System.out.println(hero);
        BaseHero doctor = new Doctor();

        System.out.println(hero.getInfo());
        System.out.println(doctor.getInfo());

        doctor.attack(hero);
        hero.attack(doctor);

        System.out.println(hero.getInfo());
        System.out.println(doctor.getInfo());


        doctor.healing(hero);
        doctor.healing(doctor);
        hero.healing(doctor);


        System.out.println(hero.getInfo());
        System.out.println(doctor.getInfo());








        

        // #endregion

    }
}