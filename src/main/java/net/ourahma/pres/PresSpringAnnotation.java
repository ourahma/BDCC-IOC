package net.ourahma.pres;

import net.ourahma.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        // créer les objet en se basant sur les components
        ApplicationContext applicationcontext =  new AnnotationConfigApplicationContext("net.ourahma");

        IMetier metier = applicationcontext.getBean(IMetier.class);
        System.out.println("RES = "+metier.calculer());
    }
}
