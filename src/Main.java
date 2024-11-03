import java.time.LocalDate;

public class Main {
    public static void identifierLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static void identifierDeviceOS(int deviceYear, int deviceOS) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYear < currentYear && deviceOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (deviceYear >= currentYear && deviceOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (deviceYear < currentYear && deviceOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (deviceYear >= currentYear && deviceOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void calculatorDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("доставки нет");
        }
    }
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        int year = 2015;
        identifierLeapYear(year);

        //task2
        System.out.println("task2");
        int deviceYear = 2022;
        int deviceOS = 0;
        identifierDeviceOS(deviceYear, deviceOS);

        //task3
        System.out.println("task3");
        int deliveryDistance = 95;
        calculatorDeliveryTime(deliveryDistance);
    }
}