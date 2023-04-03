package Point;

public class PointTwo {
   static double x = 1555.15;
    static double y = 248.7;

    public static boolean checkPoint(double x, double y) {
        if (x < 0 || y < 0) {
            return false;
        } else {
            return true;
        }

    }


    public static void main(String[] args) {
        PointThree three = new PointThree();

        System.out.println("It method for two point - " + checkPoint(x, y));
        System.out.println("It method for three point - " + three.checkPoint(three.getX(), three.getY(), three.getZ()));
        System.out.println("It @method for three2 point - " + checkPoint(three.getX(), three.getY(), three.getZ()));

    }
    public static boolean checkPoint(double x, double y, double z) {
        if (x < 0 || y < 0 || z < 0) {
            return false;
        } else {
            return true;
        }
    }
}

