package net.ourahma.metier;

import net.ourahma.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("d")
    private IDao dao; // le fait de dépendre de l'interface et le couplage faible
    @Override
    public double calculer() {
        double t = dao.getData();
        double res = t * 12 * Math.PI/2 * Math.cos(t);
        return res;
    }
    /*
     pour injecter dans la variable dao une classe qui implèmente l'interface IDao
     au moment de la création de l'objet
     */
    public MetierImpl(@Qualifier("d") IDao dao) {
        this.dao = dao;
    }

    //public MetierImpl() {}

    /*
     pour injecter dans la variable dao une classe qui implèmente l'interface IDao
     après instantiation
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
