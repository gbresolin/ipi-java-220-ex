package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

// Création de la classe entreprise
public class Entreprise {
    public static final Double SALAIRE_BASE = 1480.27;
    public static final Integer NB_CONGES_BASE = 25;
    public static final Double INDICE_MANAGER = 1.3;
    public static final Double PRIME_MANAGER_PAR_TECHNICIEN = 250.0;
    public static final Double PRIME_ANCIENNETE = 100.0; // ou 100d équivalent

    // Création d'une méthode
    public static Double primeAnnuelleBase() {
        return LocalDate.now().getYear() / 2d;
    }


}

