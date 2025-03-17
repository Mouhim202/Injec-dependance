package net.mhm.metier;

import net.mhm.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    //@Qualifier("d2")
    private IDao dao;

    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implemente l'interface IDO
     * au moment de l'instansiation
     */
    public MetierImpl(@Qualifier("d2") IDao dao) {

        this.dao = dao;
    }




    @Override
    public double calcul() {
        double t=dao.getData();
        double res= t*12*Math.PI/2*Math.cos(t);
        return res;
    }
    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implemente l'interface IDO
     * aprés instansiation
     *
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}





















