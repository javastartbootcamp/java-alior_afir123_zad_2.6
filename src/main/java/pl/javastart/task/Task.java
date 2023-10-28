package pl.javastart.task;

public class Task {

    boolean isEven(int a) {
        boolean result;
        result = a % 2 == 0;
        return result;
    }

    boolean isOdd(int a) {
        boolean result;
        result = a % 2 != 0;
        return result;
    }

    double circleField(int a) {
        double field;
        field = Math.PI * Math.pow(a, 2);
        return field;
    }

    double power(int a) {
        double power;
        power = Math.pow(a, 2);
        return power;
    }
}