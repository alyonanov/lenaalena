package Hierarchy.Clas;

import Hierarchy.Inter.BuyCar;

public abstract class VAG implements BuyCar {

    protected boolean spoiler;

    public VAG()
    {
        spoiler = false;
    }

    public VAG(boolean w)
    {
        spoiler = w;
    }

    public abstract void print_inf();
    
}
