package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.*;

public class CalculOccurences implements ISymptomCalcul {

    @Override
    public Map<String, Integer> CalculSymptoms(List<String> symptoms) {

        //Création d'une nouvel map.
        Map<String, Integer> map = new TreeMap<>();

        try {
            // Utilisation d'une boucle forEach qui va récupérer chaque occurences dans le fichier et ajouté +1 si déjà trouvé la valeur par défault sera 0.
            symptoms.forEach(symptom -> map.put(symptom, map.getOrDefault(symptom, 0) + 1));

        } catch (Exception e) {
            // Gestion de l'exception qui affichera une trace dans le fichier log.
            e.printStackTrace();
        }
        return map;
    }


}
