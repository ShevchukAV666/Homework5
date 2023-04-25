public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 1)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 2)
            System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2016;

        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите версию приложения для Android по ссылке");
    }


    public static void task3() {
        System.out.println("Задача 3");
        int year = 2019;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " год весокосный");
        else
            System.out.println(year + " год не весокосный");
    }


    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 70;
        int dayOfDelivery = 1;
        if (deliveryDistance < 20) {
            System.out.println("Доставка занимает " + (dayOfDelivery * 1) + " день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Доставка займет " + (dayOfDelivery * 2) + " дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Доставка займет " + (dayOfDelivery * 3) + " дня");
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставка не осуществляется");
        }

    }


        public static void task5() {
            System.out.println("Задача 5");
        int  monthNumber = 4;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зимний сезон");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний сезон");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний сезон");
                break;
            default:
                System.out.println("В году только 12 месцев!");
        }
        }

    }











