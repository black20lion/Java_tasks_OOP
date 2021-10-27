package ru.myCompany.My;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (CheckNotExistence(new MyPoint(x1 ,y1), new MyPoint(x2, y2), new MyPoint(x3, y3)))
            throw new IllegalArgumentException("This triangle does not exist");
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);

    }


    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) throws IllegalArgumentException {
        if (CheckNotExistence(v1, v2 ,v3)) throw new IllegalArgumentException("This triangle does not exist");
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    private boolean CheckNotExistence(MyPoint v1, MyPoint v2, MyPoint v3) {
        return v1.distance(v2) >= v2.distance(v3) + v3.distance(v1) ||
                v2.distance(v3) >= v3.distance(v1) + v1.distance(v2) ||
                v3.distance(v1) >= v1.distance(v2) + v2.distance(v3);
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ']';
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }


    // An equilateral triangle cannot exist in integer coordinates
    // in this implementation, a triangle with a difference between
    // the largest and the smallest sides of less than 1% is considered
    // to be conditionally equilateral

    public String getType() {
        double dist1 = v1.distance(v2);
        double dist2 = v2.distance(v3);
        double dist3 = v3.distance(v1);

        double tempMax = Math.max(dist1, dist2);
        double trueMax = Math.max(tempMax, dist3);

        double tempMin = Math.min(dist1, dist2);
        double trueMin = Math.min(tempMin, dist3);


        if (dist1 == dist2 || dist2 == dist3 || dist3 == dist1)
            return "Isosceles";
        else if ((trueMax - trueMin) / trueMin <= 0.01)
            return "Equilateral";
        else
            return "Scalene";
    }
}
