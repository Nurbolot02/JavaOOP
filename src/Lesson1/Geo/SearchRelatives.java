package Lesson1.Geo;

import java.util.ArrayList;

public interface SearchRelatives {
    default public void searchRelatives(GeoTree geoTree, Relationship relationship) {
        ArrayList<String> res = new Research(geoTree).spend((Person) this, relationship);
        if (res.size() == 0) {
            System.out.printf("У %s - нету %s\n", ((Person) this).getFullName(), relationship);
        } else {
            System.out.printf("Список %s - %s\n", relationship, ((Person) this).getFullName());
            for (int i = 0; i < res.size(); i++) {
                System.out.println((i + 1) + ": " + res.get(i));
            }
        }
    }

    default public void getAllRelatives(GeoTree geoTree){
        for (Relationship relationship1: Relationship.values()){
            this.searchRelatives(geoTree, relationship1);
        }
    }
}
