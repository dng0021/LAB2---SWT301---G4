package org.example;

import java.util.Scanner;

public class GCDandLCM {
    // Hàm tính ước chung lớn nhất (UCLN) sử dụng thuật toán Euclid
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Hàm tính bội chung nhỏ nhất (BCNN)
    public static int calculateLCM(int a, int b) {
        int gcd = calculateGCD(a, b);
        return (a * b) / gcd;
    }

    // Hàm kiểm tra tính hợp lệ của đầu vào (chỉ chấp nhận số nguyên dương)
    public static int codeCheck(Scanner scanner, String prompt) {
        int number;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    break;
                } else {
                    System.out.println("Vui lòng nhập số nguyên dương.");
                }
            } else {
                System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
                scanner.next(); // Xóa giá trị không hợp lệ khỏi bộ đệm của scanner
            }
        }
        return number;
    }

    // Hàm kiểm tra tính hợp lệ của đầu vào (chấp nhận cả số nguyên không âm)
    public static int codeCheckPositiveInteger(Scanner scanner, String prompt) {
        int number;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    break;
                } else {
                    System.out.println("Vui lòng nhập số nguyên không âm.");
                }
            } else {
                System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
                scanner.next(); // Xóa giá trị không hợp lệ khỏi bộ đệm của scanner
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số từ người dùng với kiểm tra đầu vào bằng hàm codeCheck
        int number1 = codeCheck(scanner, "Nhập số thứ nhất (nguyên dương): ");
        int number2 = codeCheck(scanner, "Nhập số thứ hai (nguyên dương): ");

        // Tính và in ra UCLN và BCNN của hai số
        int gcd = calculateGCD(number1, number2);
        int lcm = calculateLCM(number1, number2);

        System.out.println("Ước chung lớn nhất của " + number1 + " và " + number2 + " là: " + gcd);
        System.out.println("Bội chung nhỏ nhất của " + number1 + " và " + number2 + " là: " + lcm);

        // Nhập thêm số khác từ người dùng với kiểm tra đầu vào bằng hàm codeCheckPositiveInteger
        int anotherNumber = codeCheckPositiveInteger(scanner, "Nhập một số nguyên không âm khác: ");
        System.out.println("Bạn đã nhập số: " + anotherNumber);

        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }
}
