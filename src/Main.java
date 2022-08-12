public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //task 01//

        byte clientOS = 1;
        // clientOS(Android)=1; clientOS(IOS)=0//
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //task 02//

        int clientDeviceYear = 2014;
        byte clientOS1 = 0;
        // clientOS1 (Android)=0; clientOS1 (IOS)=1//
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите приложение  для");
            if (clientOS1 == 0) {
                System.out.println("Android по ссылке");
            } else {
                System.out.println("iOS по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для");
            if (clientOS1 == 0) {
                System.out.println("Android по ссылке");
            } else {
                System.out.println("iOS по ссылке");
            }
        }
        //task 03//

        int year = 2104;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //task 04//
        int deliveryDistance = 45;
        int days = 1;
        if (deliveryDistance <= 20) {
            days=days;
        }
        if (deliveryDistance > 20 && deliveryDistance < 60){
            days++;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 90){
            days=days+2;
        }
        System.out.println("Для доставки на расстояне "+deliveryDistance+" км понадобиться дней: " + days);


        //task 05//

        byte monthNumber = 14;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
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
                System.out.println("Такого месяца не сущетвует");

        }
    }
}

