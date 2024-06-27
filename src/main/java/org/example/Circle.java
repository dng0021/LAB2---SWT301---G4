package org.example;

import java.util.Scanner;

public class Circle {

    public static boolean isValidCircle(double a) {
        return (a > 0);
    }

    public static double calculateArea(double a) {
        return Math.PI * a * a;
    }

    public static double calculatePerimeter(double b) {
        return 2 * Math.PI * b;
    }

    public static double calculateDiameter(double c) {
        return 2 * c;
    }

    public static double calculateSphereSurfaceArea(double d) {
        return 4 * Math.PI * d * d;
    }

    public static double calculateSphereVolume(double e) {
        return (4.0 / 3.0) * Math.PI * Math.pow(e, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius;

        do {
            System.out.print("Nhập bán kính của hình tròn: ");
            radius = scanner.nextDouble();
            if (!isValidCircle(radius)) {
                System.out.println("Bán kính đường tròn phải > 0");
            }
        } while (!isValidCircle(radius));

        double area = calculateArea(radius);
        double perimeter = calculatePerimeter(radius);
        double diameter = calculateDiameter(radius);
        double sphereSurfaceArea = calculateSphereSurfaceArea(radius);
        double sphereVolume = calculateSphereVolume(radius);

        System.out.println("Diện tích của hình tròn là: " + area);
        System.out.println("Chu vi của hình tròn là: " + perimeter);
        System.out.println("Đường kính của hình tròn là: " + diameter);
        System.out.println("Diện tích mặt cầu là: " + sphereSurfaceArea);
        System.out.println("Thể tích khối cầu là: " + sphereVolume);

        scanner.close();
    }
}
