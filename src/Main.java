public class Main {
    public static void printYear(int year) {
        System.out.println(year + " Год-високосный год");
    }

    public static void printClietOS(int clientOS, int clientDeviceYear) {
        System.out.println("установите облегченную версию приложения");
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            printYear(year);
        } else {
            System.out.println(year + " Год -невисокосный год");
        }
    }

    public static void task2() {
        System.out.println("Задача 2 ");
        int clientOS = 0;
        int iOS = 1;
        int android = 0;
        int clientDeviceYear = 2014;
        if (clientOS == android && clientDeviceYear < 2015) {
            printClietOS(clientOS, clientDeviceYear);
        } else if (clientOS == iOS && clientDeviceYear < 2015) {
            printClietOS(clientOS, clientDeviceYear);
        } else {
            System.out.println("Установите приложение по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
    }

    public static void printDeliveryInfo(int dieiveryDistance) {
        int deliveryDays = getDeliveryDayas(dieiveryDistance);
        if (deliveryDays == -1) {
            System.out.println("Доставки нет ");
        } else {
            System.out.println();

        }
    }

    public static int getDeliveryDayas ( int dieiveryDistance){
        int deliveryDistance=1;
        if (dieiveryDistance < 20) {
            return 1;
        } else if (dieiveryDistance <= 60) {
            return 2;
        } else if (dieiveryDistance <= 100) {
            return 3;
        } else {
            return - 1;
        }
        printDeliveryInfo(3);

    }
}


