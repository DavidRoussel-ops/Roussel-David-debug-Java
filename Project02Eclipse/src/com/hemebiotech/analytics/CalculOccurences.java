package com.hemebiotech.analytics;

import java.util.*;

public class CalculOccurences implements ISymptomCalcul {

    @Override
    public Map<String, Integer> CalculSymptoms(List<String> symptoms) {

        //Création d'une nouvel map
        Map<String, Integer> map = new TreeMap<>();

        symptoms.forEach(symptom -> map.put(symptom, map.getOrDefault(symptom, 0) + 1));

        return map;

    }


}
