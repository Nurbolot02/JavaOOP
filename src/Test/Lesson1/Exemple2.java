package Test.Lesson1;

public class Exemple2 {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);

        Point2D b = new Point2D(0);

        System.out.println(b.toString());
        //System.out.println(Distance(a, b));
        System.out.println(b);
        System.out.println(a);

        var dis = Point2D.Distance(a, b);
        System.out.println(dis);





        Point3D a1 = new Point3D(3,6,8);
        Point3D b1 = new Point3D(2,1,7);
        var disd = Point3D.Distance(a1, b1);
        System.out.println(disd);
    }


}
