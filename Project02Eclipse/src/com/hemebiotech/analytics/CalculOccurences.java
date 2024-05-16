package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.*;

public class CalculOccurences implements ISymptomCalcul {

    @Override
    public Map<String, Integer> CalculSymptoms(List<String> symptoms) {

        //Création d'une nouvel map
        Map<String, Integer> map = new TreeMap<>();

        try {

            symptoms.forEach(symptom -> map.put(symptom, map.getOrDefault(symptom, 0) + 1));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


}
