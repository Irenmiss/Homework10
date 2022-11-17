import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int yearForCheck = 1600;
        System.out.println(yearForCheck + " - " + determineLeapYear(yearForCheck));

        System.out.println("Задание 2");
        int currentYear = LocalDate.now().getYear();
        int clientOS = 1;
        System.out.println(determineDateOfOSVersion(currentYear) + " для " + determineOSVersion(clientOS));

        System.out.println("Задание 3");
        int deliveryDistance = 101;
        printDeliveryDaysDecision(deliveryDistance);
    }

    public static String determineLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return "високосный год";
        } else if (year % 100 == 0 && year % 4 == 0 && year % 400 == 0) {
            return "високосный год";
        }
        return "не високосный год";
    }

    public static String determineOSVersion(int clientOS) {
        if (clientOS == 0) {
            return "iOS";
        } else if (clientOS == 1) {
            return "Android";
        }
        return "не удалось определить операционную систему";
    }

    public static String determineDateOfOSVersion(int currentYear) {
        if (currentYear > 2015) {
            return "Установите версию приложения";
        } else
            return "Установите облегченную версию приложения";
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        }
        return 0;
    }

    public static void printDeliveryDaysDecision(int deliveryDistance) {
        if (calculateDeliveryDays(deliveryDistance) != 0) {
            System.out.println("Доставка займет дней: " + calculateDeliveryDays(deliveryDistance));
        } else {
            System.out.println("Доставка на указанное расстояние не осуществляется");
        }
    }
}