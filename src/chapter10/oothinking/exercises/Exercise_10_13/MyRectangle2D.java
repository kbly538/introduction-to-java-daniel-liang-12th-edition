package chapter10.oothinking.exercises.Exercise_10_13;

import chapter10.oothinking.exercises.Exercise_10_04.MyPoint;

public class MyRectangle2D {
    private double x, y, width, height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);

    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return Math.round(((height * width) * 100)) / 100.0;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public boolean contains(double x, double y) {
        return (this.x - (width / 2.0)) < x
                && (this.x + (width / 2.0)) > x
                && (this.y - (height / 2.0)) < y
                && (this.y + (height / 2.0)) > y;
    }

    public boolean contains(MyRectangle2D r2) {
        for (int i = 0; i < 4; i++) {
            if (!this.contains(r2.getBoundingPoints()[i].getX(), r2.getBoundingPoints()[i].getY()))
                return false;
        }
        return true;
    }

    public boolean overlaps(MyRectangle2D r2) {
        int numberOfPointsInside = 0;
        for (int i = 0; i < 4; i++) {
            if (this.contains(r2.getBoundingPoints()[i].getX(), r2.getBoundingPoints()[i].getY()))
                numberOfPointsInside++;
        }
        return numberOfPointsInside == 1 || numberOfPointsInside == 2;
    }

    public MyPoint[] getBoundingPoints() {
        double halfWidth = width / 2.0;
        double halfHeight = height / 2.0;
        MyPoint topLeft = new MyPoint(this.x - (halfWidth), this.y + (halfHeight));
        MyPoint topRight = new MyPoint(this.x + (halfWidth), this.y + (halfHeight));
        MyPoint bottomLeft = new MyPoint(this.x - (halfWidth), this.y - (halfHeight));
        MyPoint bottomRight = new MyPoint(this.x + (halfWidth), this.y - (halfHeight));

        return new MyPoint[]{topLeft, topRight, bottomLeft, bottomRight};
    }
}
