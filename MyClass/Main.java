package MyClass;

import Hierarchy.Clas.Audi;
import Hierarchy.Clas.Ford;
import Hierarchy.Clas.Mercedes;
import Hierarchy.Clas.Vinil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Audi audi = new Audi();
        Mercedes mercedes = new Mercedes();
        Vinil vinil = new Vinil();
        Ford ford = new Ford();
        int menu;
        String date = "26.09.2022";
        int hour = 14, minute = 20;
        do {
            System.out.println("Введите номер меню:");
            System.out.println("1.Ввод данных");
            System.out.println("2.Завершение");
            Scanner in = new Scanner(System.in);
             menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Ауди");
                    audi.print_date(date);
                    audi.print_time(hour, minute);
                    audi.print_place();
                    audi.print_how_many(10);

                    System.out.println("\nМерседес");
                    mercedes.print_place();
                    mercedes.print_how_many(1);

                    System.out.println("\nВиниловая плёнка");
                    vinil.print_count(400);
                    vinil.print_characteristic("Винил");

                    System.out.println("\nFord");
                    ford.print_date(date);
                    ford.print_time(hour, minute);
                    ford.print_place();
                    ford.print_how_many(15);
                    ford.print_name("Седаны");
                    ford.print_inf();
                    break;
                case 2:
                    in.close();
                    break;
                default:
                    System.out.println("Неправильный ввод");
                    break;
            }
        }
            while (menu != 2) ;

    }
}
