package swed.it.academy.project;

import java.math.BigDecimal;

public class Triangle extends Shape{

    public Triangle(BigDecimal s1, BigDecimal s2) {
        super(s1, s2);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();
        BigDecimal triArea = super.getArea().divide(BigDecimal.valueOf(2));
        super.setArea(triArea);
    }
}
