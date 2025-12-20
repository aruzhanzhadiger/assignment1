package models;
import java.util.ArrayList;
public class Shape {

    private ArrayList<Point> points;
    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point p) {
        points.add(p);
    }

    public double calculatePerimeter() {
        double sum = 0;
        for (int i = 0; i < points.size() - 1; i ++) {
            sum += points.get(i).distance(points.get(i + 1));
        }

        sum += points.get(points.size() - 1).distance(points.get(0));
        return sum;
    }

    public double getLongestSide() {
        double max = 0;
        for (int i = 0; i < points.size() - 1; i ++) {
            double d = points.get(i).distance(points.get(i + 1));
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public double getAverageSide() {
        return calculatePerimeter() / points.size();
    }
}
