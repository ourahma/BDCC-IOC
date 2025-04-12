package net.ourahma.metier;

import net.ourahma.dao.IDao;

public class MetierImpl implements IMetier {
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
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    /*
     pour injecter dans la variable dao une classe qui implèmente l'interface IDao
     après instantiation
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
