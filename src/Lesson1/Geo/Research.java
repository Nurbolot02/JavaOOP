package Lesson1.Geo;

import java.util.ArrayList;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        if (p == null || re == null) {
            System.out.printf("Pole is null");
            return null;
        } else {
            for (Node t : tree) {
                if (t.p2.getFullName() == p.getFullName() && t.re == re) {
                    result.add(t.p1.getFullName());
                }
            }
            return result;
        }
    }

}
