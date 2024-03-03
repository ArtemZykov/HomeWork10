import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
        int year = 2000;
        checkLeapYear(year);
        int currentYear = LocalDate.now().getYear();
        int OS = 1;
        requiredDevice(OS, currentYear);
        int deliveryDistance = 101;
        requiredTime(deliveryDistance);
        System.out.println();
    }
        public static void checkLeapYear( int checkYear) {
            if (checkYear < 1584) {
                System.out.println(" до 1584 года, высокосные года не считали ");
            } else if (checkYear > 1584 && (checkYear % 400 == 0 && checkYear % 100 != 0 || checkYear % 4 == 0)) {
                System.out.println(" " + checkYear + " год является высокосным ");
            }else {
                System.out.println(" " + checkYear + "  год не является высокосным ");

            }




            System.out.println();
        }
        public static void requiredDevice(int OS, int currenYear) {
            if (currenYear < 2015 && OS == 0) {
                System.out.println(" Установите облегченную версию ПО для IOS  по ссылке ");
            } else if ( OS == 0) {
                System.out.println(" Позже вам все равно необходимо будет установить облегченную версию для IOS");
            } else if (currenYear < 2015 && OS != 0) {
                System.out.println(" Установи облегченную версию для Android по ссылке ");
            } else if (OS != 0) {
                System.out.println(" Позже вам все равно необходимо будет установить облегченную версию для Android ");
            } else {
                System.out.println(" неверно задана ПО ");
            }
            System.out.println();
        }

        public static void requiredTime ( int deliveryDistance) {
            if (deliveryDistance <= 20) {
                System.out.println(" Доставка будет сегодня в течении суток");
            }
            if (deliveryDistance > 20 && deliveryDistance < 60) {
                int days = 2;
                System.out.println(" Доставка будет в течении " + days + " дней ");

            } else if (deliveryDistance <= 100) {
                int days = 3;
                System.out.println(" доставка будет в течении " + days + " дней");
            }if (deliveryDistance > 100) {
                System.out.println(" Доставки нет ");
            }
        }

    }





