package swed.it.academy.project;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IOManager {

    static final Scanner scanner = new Scanner(System.in);

    private static int option;
    private static BigDecimal data1;
    private static BigDecimal data2;

    public static int getOption() {
        return option;
    }

    public static BigDecimal getData1() {
        return data1;
    }

    public static BigDecimal getData2() {
        return data2;
    }

    public static void chooseShape() {
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Choose your shape:");
                System.out.println("1 - Square");
                System.out.println("2 - Triangle");
                System.out.println("3 - Circle");
                System.out.println("4 - Hexagon");

                option = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again");
                scanner.nextLine();
            }

        }
    }

    public static void inputData() throws UnknownShapeException {
        switch (option) {
            case 1:
                System.out.println("Enter the length (in cm) of a square side: ");
                data1 = scanner.nextBigDecimal();
                break;
            case 2:
                System.out.println("Enter the length (in cm) of a leg A: ");
                data1 = scanner.nextBigDecimal();
                System.out.println("Enter the length (in cm) of a leg B: ");
                data2 = scanner.nextBigDecimal();
                break;
            case 3:
                System.out.println("Enter the length (in cm) of a radius: ");
                data1 = scanner.nextBigDecimal();
                break;
            case 4:
                System.out.println("Enter the length (in cm) of a hexagon side: ");
                data1 = scanner.nextBigDecimal();
                break;
            default:
                throw new UnknownShapeException("This option does not exist. Please enter a valid one");
        }
    }

    public static void showCalculatedArea(String shapeRep) {
        System.out.println(shapeRep);
        System.out.println("-------------END---------------");
    }
}
