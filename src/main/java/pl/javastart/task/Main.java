package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Task example = new Task();

        boolean result1 = example.isEven(15);
        System.out.println("Czy podana zmienna jest parzysta: " + result1);

        boolean result2 = example.isOdd(15);
        System.out.println("Czy podana zmienna jest nieparzysta: " + result2);

        double result3 = example.circleField(15);
        System.out.println("Pole koła o podanym priomieniu wynosi: " + result3);

        double result4 = example.power(15);
        System.out.println("Kwadrat podanej liczby wynosi: " + result4);

    }
}
