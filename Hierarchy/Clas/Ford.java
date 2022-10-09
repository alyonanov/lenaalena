package Hierarchy.Clas;

import Hierarchy.Inter.BuyCar;
import Hierarchy.Inter.BuySpareParts;

public class Ford implements BuyCar, BuySpareParts {

    private String type;
    private int weight;

    public Ford()
    {
        type = "t";
        weight = 100;
    }

    public Ford(String t, int w)
    {
        type = t;
        weight = w;
    }

    public void print_inf()
    {
        System.out.println("Ford "+type);
        System.out.println("с весом "+weight);
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
    public String print_name(String name) {
        System.out.println("Тип кузова: "+name);
        type = name;
        return null;
    }

    @Override
    public int print_how_many(int count) {
        System.out.println("В наличии "+count +" штук");
        return 0;
    }
    
}
