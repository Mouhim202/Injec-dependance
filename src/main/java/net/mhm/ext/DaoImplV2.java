package net.mhm.ext;
import net.mhm.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Versions capteurs.......");
        double t=12;
        return t;
    }
}
