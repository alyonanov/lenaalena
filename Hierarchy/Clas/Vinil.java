package Hierarchy.Clas;

import Hierarchy.Inter.BuyAccessories;
import Hierarchy.Inter.BuyColor;
import Hierarchy.Inter.BuySpareParts;

public class Vinil implements BuyAccessories, BuyColor, BuySpareParts {

    private int weight;
    private String view;
    private String mark;
    
    public Vinil()
    {
        weight = 400;
        view = "v";
        mark = "m";
    }

    public int getWeight() {
        return weight;
    }
    public String getView() {
        return view;
    }
    public String getMark() {
        return mark;
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
        System.out.println("Авиационная 3");
        return 0;
    }

    @Override
    public String print_name(String name) {
        System.out.println("Тип плёнки:"+ name);
        mark = name;
        return null;
    }

    @Override
    public int print_count(int weight) {
        System.out.println("Количество: "+ weight);
        return 0;
    }

    @Override
    public int print_view(String view) {
        System.out.println("Вид: "+view);
        this.view = view;
        return 0;
    }

    @Override
    public void print_characteristic(String charact) {
        System.out.println("Материал: "+charact);
        
    }
    
    
}
