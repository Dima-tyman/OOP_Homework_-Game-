package Units;

import java.util.Arrays;
import java.util.Random;

public class Coordinate {

    public static int maxX = 10, maxY = 10;
    private double x, y;


    public Coordinate(double x, double y) {
        this.x = x > maxX ? maxX : x;
        this.y = y > maxY ? maxY : y;
    }

    public Coordinate(double x) {
        this(x, new Random().nextFloat() * maxY);
    }

    public Coordinate() {
        this(new Random().nextFloat() * maxX);
    }


    @Override
    public String toString() {
        return Arrays.toString(new double[]{this.x, this.y});
    }


    public static double getMinDistance(Coordinate a, Coordinate b) {
        return Math.sqrt((Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2)));
    }

    public double getMinDistance(Coordinate target) {
        return getMinDistance(this, target);
    }

    public void setCoordinate(double[] coordinate) {
        this.x = coordinate[0];
        this.y = coordinate[1];
    }

    public double[] getCoordinate() {
        return new double[]{this.x, this.y};
    }
}
