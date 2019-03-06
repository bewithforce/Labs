package lab1;

import java.util.Objects;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        int n;
        String p = null;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > 0 && arr[i + 1] > 0) {
                p = period(arr[i], arr[i + 1]);
                break;
            }
        }
        System.out.println(Objects.requireNonNullElse(p,"bad array"));
    }

    private static String period(int a, int n) {
        if (n % 10 == 0) return period(a, n / 10);
        if (n % 2 == 0) return period(a * 5, n / 2);
        if (n % 5 == 0) return period(a * 2, n / 5);
        a %= n;
        int pow = a;
        StringBuilder period = new StringBuilder();
        while (true) {
            pow *= 10;
            period.append(pow / n);
            pow %= n;
            if (pow == a) {
                return period.toString();
            }
        }
    }
}
