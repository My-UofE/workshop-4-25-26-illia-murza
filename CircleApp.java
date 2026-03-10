public class CircleApp {
    public static void main( String[] args ) {
        Circle myCircle1 = new Circle(3, 2, 2);

        System.out.println("Radius: "+myCircle1.getRadius()+", X: "+myCircle1.getOriginX()+", Y: "+myCircle1.getOriginY());
        System.out.println("Area: "+myCircle1.getArea()+", Circumference: "+myCircle1.getCircumference());

        Circle myCircle2 = new Circle(2, 6, 2);
        Circle myCircle3 = new Circle(1, 1, 2);

        System.out.println(myCircle1.isOverlappedWith(myCircle2));
        System.out.println(myCircle1.isOverlappedWith(myCircle3));

        System.out.println(myCircle1.isEnclosedBy(myCircle3));
        System.out.println(myCircle3.isEnclosedBy(myCircle1));
    }
}