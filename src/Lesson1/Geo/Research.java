package Lesson1.Geo;

import java.util.ArrayList;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        if (p == null || re == null){
            System.out.printf("Pole is null");
            System.exit(-1);
            return null;
        }else {
            for (Node t : tree) {
                if (t.p1.fullName == p.fullName && t.re == re) {
                    result.add(t.p2.fullName);
                }
            }
            return result;
        }
    }

}
