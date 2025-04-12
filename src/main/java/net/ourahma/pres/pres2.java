package net.ourahma.pres;

import net.ourahma.dao.IDao;
import net.ourahma.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    // FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException 
    public static void main(String[] args) throws Exception{
        // lire le fichier
        Scanner scanner = new Scanner(new File("config.txt"));

        //lire le nom de la classe
        String docClassName = scanner.nextLine();
        /*
        créer un objet de la classe
        en premier en charge la classe dans la mémoire
         */
        Class cDao = Class.forName(docClassName);
        // créer l'objet
        IDao dao = (IDao) cDao.newInstance();
        //System.out.println(dao.getData());

        // faire la meme chose pour l'objet matier
        String metierClassName = scanner.nextLine();
        Class cmetier = Class.forName(metierClassName);
        //IMetier metier = (IMetier) cmetier.getConstructor(IDao.class).newInstance(dao);
        IMetier metier = (IMetier) cmetier.getConstructor().newInstance();
        Method setDao = cmetier.getMethod("setDao", IDao.class);
        setDao.invoke(metier, dao);
        System.out.println("RES = " + metier.calculer());
    }
}
