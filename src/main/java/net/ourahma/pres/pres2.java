package net.ourahma.pres;

import net.ourahma.dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pres2 {
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
        System.out.println(dao.getData());
    }
}
