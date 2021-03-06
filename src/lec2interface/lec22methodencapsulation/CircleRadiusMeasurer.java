package lec2interface.lec22methodencapsulation;

public class CircleRadiusMeasurer implements Measurer {

    @Override
    public double measure(Object obj) {

        // not safe, since object may not be Country
        Circle circle = (Circle) obj;
        return circle.getRadius();
    }
}
