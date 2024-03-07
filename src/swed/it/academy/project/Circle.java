package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape{

    public Circle(BigDecimal radius) {
        super(radius, radius);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();
        BigDecimal circleArea = BigDecimal.valueOf(Math.PI).multiply(super.getArea()).setScale(2, RoundingMode.UP);
        super.setArea(BigDecimal.valueOf(circleArea.doubleValue()));
    }
}
