package Lesson1.Geo;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        if (!parent.equals(children)){
            tree.add(new Node(parent, Relationship.parent, children));
            tree.add(new Node(children, Relationship.children, parent));
        }
    }

}
