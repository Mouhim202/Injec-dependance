package net.mhm.pres;

import net.mhm.metier.MetierImpl;
import net.mhm.ext.DaoImplV2;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d=new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);
        System.out.println("Res="+metier.calcul());

    }
}
