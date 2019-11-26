package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class main {
    public static void main(String[] args) {
        System.out.println("Bienvenue !");
        System.out.println("Salaire de base de l'entreprise : " + Entreprise.SALAIRE_BASE);
        Entreprise e = new Entreprise();

        Employe emp = new Employe("Doe", "John", "M12345", LocalDate.now(), Entreprise.SALAIRE_BASE);
        Employe emp2 = new Employe("Doe", "John", "M12345", LocalDate.now(), Entreprise.SALAIRE_BASE);

            System.out.println(emp.getNom());
            System.out.println(emp2.getNom());
            System.out.println(emp2.getPrenom());
            emp2.setPrenom("Jane");
            System.out.println(emp2.getPrenom());

            System.out.println(emp.toString());

            System.out.println(emp = emp2);
            System.out.println(emp.equals(emp2));
            System.out.println(emp.hashCode());

            emp.augmenterSalaire(0.5);
            System.out.println(emp.getSalaire());






    }
}
