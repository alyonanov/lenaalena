package Hierarchy.Clas;

import Hierarchy.Inter.BuyAccessories;
import Hierarchy.Inter.BuySpareParts;

public class TiresWithRims implements BuySpareParts, BuyAccessories {

    public int count;
    public int weight;

    public TiresWithRims()
    {
        count = 4;
        weight = 300;
    }

    public TiresWithRims(int c, int w)
    {
        count = c;
        weight = w;
    }

    public void print_inf()
    {
        System.out.println("Количество штук "+count);
        System.out.println("Итоговый вес "+weight);
    }

    @Override
    public int print_date(String date) {
        System.out.println("Дата" + date);
        return 0;
    }

    @Override
    public int print_time(int hour, int minute) {
        System.out.println("В "+hour+":"+minute);
        return 0;
    }

    @Override
    public int print_place() {
        System.out.println("Авиационная 3/10");
        return 0;
    }

    @Override
    public void print_characteristic(String charact) {
        System.out.println("Характеристики: "+charact);
        
    }

    @Override
    public String print_name(String name) {
        System.out.println("Название: "+name);
        return null;
    }
    
}
