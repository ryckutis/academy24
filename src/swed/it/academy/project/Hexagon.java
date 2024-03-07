package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hexagon extends Shape{

    public Hexagon(BigDecimal side){
        super(side, side);
    }

    @Override
    public void calculateArea() {
        BigDecimal side = super.getSideLength();
        BigDecimal area = BigDecimal.valueOf(3).multiply(BigDecimal.valueOf(Math.sqrt(3)).multiply(side.pow(2))).divide(BigDecimal.valueOf(2), 2, RoundingMode.HALF_UP);
        super.setArea(area);
    }
}
