package com.nguyenhanhatminh;

public class App {

    public static String giaiPhuongTrinhBac1(double a, double b) {
        if (a == 0 && b == 0) {
            return "VO_SO_NGHIEM";
        }

        if (a == 0 && b != 0) {
            return "VO_NGHIEM";
        }

        double x = -b / a;
        return "x = " + x;
    }

    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac 1: ax + b = 0");
        System.out.println("PT 2x - 4 = 0: " + giaiPhuongTrinhBac1(2, -4));
        System.out.println("PT 0x + 0 = 0: " + giaiPhuongTrinhBac1(0, 0));
        System.out.println("PT 0x + 5 = 0: " + giaiPhuongTrinhBac1(0, 5));
    }
}
