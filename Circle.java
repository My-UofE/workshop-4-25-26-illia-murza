public class Circle {
    private double radius;
    private double originX;
    private double originY;

    public Circle(double radius, double originX, double originY) {
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;
    }

    public Circle(double radius) {
        this(radius, 0, 0);
    }

    public Circle() {
        this(1, 0, 0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    public double getOriginX() {
        return originX;
    }

    public void setOriginX(double originX) {
        this.originX = originX;
    }

    public double getOriginY() {
        return originY;
    }

    public void setOriginY(double originY) {
        this.originY = originY;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getCircumference() {
        return 2 * 3.14 * radius;
    }

    public void move(double x, double y) {
        originX += x;
        originY += y;
    }

    public String toString() {
        return "Circle: radius: "+radius+" originX: "+originX+" originY: "+originY;
    }

    public void scale(double factor) {
        radius *= factor;
    }

    public boolean isOverlappedWith(Circle c) {
        double distanceX = c.originX - originX;
        double distanceY = c.originY - originY;
        double distanceBetweenCentres = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));

        if (distanceBetweenCentres < radius + c.radius) {
            return true;
        }
        return false;
    }

    public boolean isEnclosedBy(Circle c) {
        if (originX - radius >= c.originX - c.radius && originX + radius <= c.originX + c.radius &&
            originY - radius >= c.originY - c.radius && originY + radius <= c.originY + c.radius) {
            return true;
        }
        return false;
    }
}