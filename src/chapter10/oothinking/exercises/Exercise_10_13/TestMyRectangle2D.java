package chapter10.oothinking.exercises.Exercise_10_13;

public class TestMyRectangle2D {

    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2.4, 4, 2.5, 43);
        MyRectangle2D r2 = new MyRectangle2D(1, 2, 3, 5.5);
        MyRectangle2D r3 = new MyRectangle2D(1, 2, 3, 3);

        System.out.println("r1 contains r4(1.5, 5, 0.5, 3): " + r1.contains(new MyRectangle2D(1.5, 5, 0.5, 3)));
        System.out.println("r2 overlaps r5(3, 4, 4.5, 5): " + r2.overlaps(new MyRectangle2D(3, 4, 4.5, 5)));
        System.out.println("r3 overlaps r6(40, 45, 3, 2): " + r3.overlaps(new MyRectangle2D(40, 45, 3, 2)));

        MyRectangle2D r7 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("r7 area: " + r1.getArea());
        System.out.println("r7 perimeter: " + r1.getPerimeter());
        System.out.println("r7 contains (3, 3): " + r7.contains(3, 3));
        System.out.println("r7 contains r8(4, 5, 10.5, 3.2)" + r1.contains(new MyRectangle2D(4, 5,
                10.5, 3.2)));
        System.out.println("r7 overlaps r9(3, 5, 2.3, 5.4) " + r1.overlaps(new MyRectangle2D(3, 5, 2.3,
                5.4)));

    }

}

/* OUTPUT
r1 contains r4(1.5, 5, 0.5, 3): true
r2 overlaps r5(3, 4, 4.5, 5): true
r3 overlaps r6(40, 45, 3, 2): false
r7 area: 107.5
r7 perimeter: 91.0
r7 contains (3, 3): true
r7 contains r8(4, 5, 10.5, 3.2)false
r7 overlaps r9(3, 5, 2.3, 5.4) true
 */
