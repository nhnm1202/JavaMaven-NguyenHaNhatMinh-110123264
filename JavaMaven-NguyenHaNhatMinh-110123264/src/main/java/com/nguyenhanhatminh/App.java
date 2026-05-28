package com.nguyenhanhatminh;

public class App {

    public static boolean isPrimeCN(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimeVSN(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimeVN(int n) {
        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Kiem tra so nguyen to");
        System.out.println("CN - 7 la so nguyen to: " + isPrimeCN(7));
        System.out.println("VSN - 9 la so nguyen to: " + isPrimeVSN(9));
        System.out.println("VN - 11 la so nguyen to: " + isPrimeVN(11));
    }
}
