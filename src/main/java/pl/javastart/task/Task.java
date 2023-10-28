package pl.javastart.task;

public class Task {
    int variable;
    boolean result;

    void isEven(int a) {
        variable = a;
        if (a % 2 == 0) {
            result = true;
            System.out.println("Czy liczba " + a + " jest liczbą parzystą: " + result);
        } else {
            result = false;
            System.out.println("Czy liczba " + a + " jest liczbą parzystą: " + result);
        }
    }

    void isOdd(int a) {
        variable = a;
        boolean result;
        if (a % 2 != 0) {
            result = true;
            System.out.println("Czy liczba " + a + " jest liczbą nieparzystą: " + result);
        } else {
            result = false;
            System.out.println("Czy liczba " + a + " jest liczbą nieparzystą: " + result);
        }
    }

    void circleField(int a) {
        variable = a;
        double field;
        field = Math.PI * Math.pow(a, 2);
        System.out.println("Pole koła o promieniu " + a + " wynosi " + field);
    }

    void power(int a) {
        variable = a;
        double power;
        power = Math.pow(a, 2);
        System.out.println("Kwadrat z liczby " + a + " wynosi: " + power);
    }
}