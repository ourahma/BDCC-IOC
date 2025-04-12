package net.ourahma.pres;

import net.ourahma.dao.DaoImpl;
import net.ourahma.ext.DaoImplV2;
import net.ourahma.metier.MetierImpl;

public class pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        // en fait l'injection de dépendances
        //metier.setDao(d); injection de dépendances via le setter
        System.out.println("RES = "+metier.calculer());
    }
}
