import java.time.LocalDate;

public class Main {
    public static void checkLapYaer(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год являеется високосным");
        } else {
            System.out.println(year + " Год -невисокосный год");
        }

    }

    public static void printClietOS(int clientOS, int year) {
        int borderYear = 2015;
        if (clientOS == 0 && year < borderYear) {
            System.out.println("Установите облегченую версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && year >= borderYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && year < borderYear) {
            System.out.println("Установите облегченную версию для Android по ссылке ");
        } else if (clientOS == 1 && year >= borderYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Не удалось определить версию");
        }
    }
    public static void printDeliveyInfo(int diliveryDistance){
        int diliveryDays = diliveryInfo(diliveryDistance);
        if (diliveryDays == -1) {
            System.out.println("Доставки нет");
        }else {
            System.out.println("Потребуется дней "+diliveryDays);
        }
    }

    public static int diliveryInfo(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }

    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2020;
        int year2 = 2022;
        checkLapYaer(year);
        checkLapYaer(year2);

    }


    public static void task2() {
        System.out.println("Задача 2 ");
        int year = LocalDate.now().getYear();
        int clientOS = 1;
        printClietOS(clientOS, year);
    }


    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 40;
        printDeliveyInfo( 40);


        }
    }











