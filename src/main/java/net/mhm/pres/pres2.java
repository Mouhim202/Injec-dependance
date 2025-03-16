package net.mhm.pres;

import net.mhm.dao.IDao;
import net.mhm.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        //FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao d=(IDao) cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor(IDao.class).newInstance(d);
        //IMetier metier=(IMetier) cMetier.getConstructor().newInstance();
       // Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
        //setDao.invoke(metier,d);
        System.out.println("RES="+metier.calcul());


    }
}




















