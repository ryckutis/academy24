package swed.it.academy.project;

import java.math.BigDecimal;

public abstract class Shape {

    private BigDecimal area;
    private final BigDecimal side1;
    private final BigDecimal side2;

    public Shape(BigDecimal s1, BigDecimal s2) {
        this.side1 = s1;
        this.side2 = s2;
    }

    public BigDecimal getSideLength() {
        return side1;
    }

    public abstract void calculateArea();

    public void rectangleArea() {
        this.area = this.side1.multiply(this.side2);
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "The area of shape: " + area +
                " cm2";
    }
}
