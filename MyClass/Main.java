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
