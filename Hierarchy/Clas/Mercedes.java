package Hierarchy.Clas;

import Hierarchy.Inter.BuyCar;

public class Mercedes implements BuyCar {

    private int weight;

    private int diameter;

    public Mercedes()
    {
        weight = 1;
        diameter = 1;
    }

    @Override
    public int print_date(String date) {
        System.out.println("Посещение " + date);
        return 0;

    }

    @Override
    public int print_time(int hour, int minute) {
        System.out.println("В "+hour+":"+minute);
        return 0;
    }

    @Override
    public int print_place() {
        System.out.println("ул.Авиационная");
        return 0;
    }

    @Override
    public int print_how_many(int count) {
        System.out.println(count+" штук ");
        return 0;
    }
    
}
