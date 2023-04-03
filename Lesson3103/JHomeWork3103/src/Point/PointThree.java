package Point;

public class PointThree extends PointTwo {
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    double x = 1235.45;
    double y = 546.6;
    double z = 8957.9;


    public static boolean checkPoint(double x, double y, double z) {
        if (x < 0 || y < 0 || z < 0) {
            return false;
        } else {
            return true;
        }

    }






}
