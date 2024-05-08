package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

    // Création d'une méthode Main
    public Main() {
        // Instance de l'objet ISymptomReader
        ISymptomReader iSymptomReader = new ISymptomReader() {
            @Override
            public List<String> GetSymptoms() {
                return List.of();
            }
        };

        // Instance de l'objet ISymptomWriter
        ISymptomWriter iSymptomWriter = new ISymptomWriter() {
            @Override
            public void writeSymptoms(Map<String, Integer> symptoms) {

            }
        };

        // Instance de l'objet AnalyticsCounter
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
    }
}
