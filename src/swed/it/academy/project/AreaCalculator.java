package swed.it.academy.project;

public class AreaCalculator {

    public static void main(String[] args) {
        runCalculator();
    }

    private static void runCalculator() {
        talkToUser();
        outputTheResult();
    }

    private static void talkToUser() {
        IOManager.chooseShape();
        try {
            IOManager.inputData();
        } catch (UnknownShapeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void outputTheResult() {
        Shape shape = switch (IOManager.getOption()) {
            case 1 -> {
                yield new Square(IOManager.getData1());
            }
            case 2 -> {
                yield new Triangle(IOManager.getData1(), IOManager.getData2());
            }
            case 3 -> {
                yield new Circle(IOManager.getData1());
            }
            case 4 -> {
                yield new Hexagon(IOManager.getData1());
            }
            default -> {
                yield null;
            }
        };
        if (shape != null) {
            shape.calculateArea();
            IOManager.showCalculatedArea(shape.toString());
        }
    }
}
