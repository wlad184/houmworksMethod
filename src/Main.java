import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        int year = 1976;
        int currentYear = LocalDate.now().getYear();
        int clientOS = 1;
        int deliveryDistance = 15;
        verificationYear(year);
        verificationOS(currentYear, clientOS);
        calculateDistance(deliveryDistance);


    }

    //task #1
    public static void verificationYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");

        } else {
            System.out.println(year + " год не является високосным");

        }
        System.out.println();

    }

    //task #2
    public static void verificationOS(int clientDeviceYear, int clientOS) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите стандартную версию приложения для iOS по ссылке");

        }

        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите стандартную версию приложения для Android по ссылке");

        }
        System.out.println();
    }


    //task #3
    public static void calculateDistance(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Сутки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Двое суток");
        } else {
            System.out.println("Трое суток");

        }
        System.out.println();
    }
}