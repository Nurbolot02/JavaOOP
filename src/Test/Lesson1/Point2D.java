package Test.Lesson1;

/**
 * Point2D this is a constructor!
 */
public class Point2D {
    private int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Конструктор с двумя параметрами
     * @param x - Координата X
     * @param y - Координата Y
     */
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
//    public Point2D(int value) {
//        this.x = value;
//        this.y = value;
//    }
//     public Point2D(){
//        this.x = 0;
//        this.y = 0;
//     }

    /**
     * Конструктор с одним параметром
     * @param value - X и Y
     */
    public Point2D(int value){
        this(value, value);
    }

    public Point2D(){
        this(0);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("x: %d, y: %d", x, y);
    }

    static double Distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}
