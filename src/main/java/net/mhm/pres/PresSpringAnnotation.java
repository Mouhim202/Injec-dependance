package net.mhm.pres;

import net.mhm.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("net.mhm");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("RES="+metier.calcul());
    }
}
