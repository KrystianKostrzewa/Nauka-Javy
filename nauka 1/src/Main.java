import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WZORY MATEMATYCZNE");
        System.out.println("1. Podaj długość boku kwadratu aby obliczyć jego pole: ");
        Scanner sc = new Scanner(System.in);
        int squareSideLength = sc.nextInt();
        int squareArea = squareSideLength * squareSideLength;
        System.out.println("    Pole kwadratu wynosi: " + squareArea);

        System.out.println("1. Podaj długości boku prostokąta aby obliczyć jego obwód: ");
        int rectangleSideLength1 = sc.nextInt();
        int rectangleSideLength2 = sc.nextInt();
        int rectangleCircuit = rectangleSideLength1 * 2 + rectangleSideLength2 * 2;
        System.out.println("    Obwód prostokątu wynosi: " + rectangleCircuit);
    }
}