package swed.it.academy.project;

import java.math.BigDecimal;

public class Square extends Shape{

    public Square(BigDecimal oneSide) {
        super(oneSide, oneSide);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();
    }
}
