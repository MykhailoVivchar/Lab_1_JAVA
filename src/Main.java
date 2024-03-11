import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static class LinearAlgorithm {
        private double x;
        private double y;

        // Конструктор класу
        public LinearAlgorithm(double x, double y) {
            this.x = x;
            this.y = y;
        }

        // Метод для обчислення значень s та f за розрахунковими формулами
        public void calculateValues() {
            double s = 1 + x + (Math.pow(x, 2) / 2) + (Math.pow(x, 3) / 6) + (Math.pow(x, 4) / 24);
            double f = x * ((Math.sin(Math.pow(x, 3))) + (Math.pow(Math.cos(y), 2)));

            // Вивід на екран значень змінних та результатів обчислень
            System.out.println("Результати обчислень:");
            System.out.println("s = " + s);
            System.out.println("f = " + f);
        }

        // Метод для друку поточної дати і часу у вказаному форматі
        public void printCurrentDateTime() {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedDateTime = now.format(formatter);
            System.out.println("Поточний час: " + formattedDateTime);
        }

        // Метод для введення початкових значень користувачем
        public void inputInitialValues() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть значення x:");
            this.x = scanner.nextDouble();
            System.out.println("Введіть значення y:");
            this.y = scanner.nextDouble();
        }

        // Головний метод
        public static void main(String[] args) {
            // Значення x та y, зазначені в умові
            double defaultX = 0.335;
            double defaultY = 0.025;

            // Створюємо об'єкт класу зі значеннями x та y з умови
            LinearAlgorithm linearAlgorithm = new LinearAlgorithm(defaultX, defaultY);
            // Виводимо значення x та y
            System.out.println("Вхідні дані:");
            System.out.println("x = " + defaultX);
            System.out.println("y = " + defaultY);

            // Обчислюємо значення s та f
            linearAlgorithm.calculateValues();
            // Виводимо поточну дату та час
            linearAlgorithm.printCurrentDateTime();

            // Введення нових значень x та y користувачем
            linearAlgorithm.inputInitialValues();
            // Вивід результатів з новими значеннями x та y
            linearAlgorithm.calculateValues();
            linearAlgorithm.printCurrentDateTime();
        }
    }

}