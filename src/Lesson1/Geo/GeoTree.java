package Lesson1.Geo;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person person1, Person person2, Relationship relationship) {
        if (!person1.equals(person2)) {
            switch (relationship) {
                case PARENT:
                    tree.add(new Node(person1, Relationship.PARENT, person2));
                    tree.add(new Node(person2, Relationship.CHILD, person1));
                    break;
                case GRANDPA, GRANDMA:
                    tree.add(new Node(person1, (person1.getGender().equals(Gender.MALE) ? Relationship.GRANDPA : Relationship.GRANDMA), person2));
                    tree.add(new Node(person2, Relationship.GRAND_CHILD, person1));
                    break;
                case CHILD:
                    tree.add(new Node(person1, Relationship.CHILD, person2));
                    tree.add(new Node(person2, Relationship.PARENT, person1));
                    break;
                case GRAND_CHILD:
                    tree.add(new Node(person1, (person1.getGender().equals(Gender.MALE) ? Relationship.GRANDPA : Relationship.GRANDMA), person2));
                    tree.add(new Node(person2, (person1.getGender().equals(Gender.MALE) ? Relationship.GRANDPA : Relationship.GRANDMA), person1));
            }

        }
    }

}
