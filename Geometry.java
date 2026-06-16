import java.util.Scanner;

class Geometry {

    // Method to calculate area of square
    double areaSquare(double side) {
        return side * side;
    }

    // Method to calculate area of triangle
    double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate area of circle
    double areaCircle(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Geometry g = new Geometry();

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        System.out.println("Area of Square = " + g.areaSquare(side));

        System.out.print("\nEnter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        System.out.println("Area of Triangle = " + g.areaTriangle(base, height));

        System.out.print("\nEnter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle = " + g.areaCircle(radius));

        sc.close();
    }
}