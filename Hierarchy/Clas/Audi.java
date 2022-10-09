package Hierarchy.Clas;

public class Audi extends VAG {

    private int length;
    private int width;
    
    public Audi()
    {
        super();
        length = 5;
        width = 2;
    }

    @Override
    public int print_how_many(int count) {
        System.out.println("В салоне есть "+count +" штук");
        return 0;
    }

    @Override
    public int print_date(String date) {
        System.out.println("Дата посещения: "+date);
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
    public void print_inf() {
        System.out.println("Длина  "+ length);
        System.out.println("Ширина "+width);
        
    }
    
}
