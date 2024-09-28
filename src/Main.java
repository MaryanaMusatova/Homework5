public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка. Обратитесь в службу поддержки");
        }

        System.out.println("Задача №2");
        int clientDeviceYear = 2015;
        String operationSystem;
        if (clientOS == 0) {
            operationSystem = "iOS";
        } else {
            operationSystem = "Android";
        }
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + operationSystem + " по ссылке");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для " + operationSystem + " по ссылке");
        }

        System.out.println("Задача №3");
        int year = 2021;
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1585");
        }

        System.out.println("Задача №4");
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется " + days+ " день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется " + (days + 1) + "дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется " + (days + 2) + " дня");
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача №5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
}
}