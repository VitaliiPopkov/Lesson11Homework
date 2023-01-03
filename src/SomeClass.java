import java.util.Scanner;

public class SomeClass {
    public static void max(int x_max, int y_max) {
        int resMax;
        if (x_max > y_max) {
            resMax = x_max;
            System.out.println(resMax);
        } else {
            resMax = y_max;
            System.out.println(resMax);
        }

    }

    public static void average(int x_aver, int y_aver, int z_aver) {
        int resAver;

        if (x_aver >= y_aver && (x_aver <= z_aver) || x_aver <= y_aver && (x_aver >= z_aver)) {
            resAver = x_aver;
            System.out.println(resAver);
        } else if (y_aver >= x_aver && (y_aver <= z_aver) || y_aver <= x_aver && (y_aver >= z_aver)) {
            resAver = y_aver;
            System.out.println(resAver);
        } else {
            resAver = z_aver;
            System.out.println(resAver);
        }

    }

    public static void min(int x_min, int y_min) {
        int resMin;

        if (x_min < y_min) {
            resMin = x_min;
            System.out.println(resMin);
        } else {
            resMin = y_min;
            System.out.println(resMin);
        }

    }
}
