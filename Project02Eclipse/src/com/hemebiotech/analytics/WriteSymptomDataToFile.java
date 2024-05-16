package com.hemebiotech.analytics;

import java.io.*;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

    private String filepath;

    public WriteSymptomDataToFile(String filepath) {this.filepath = filepath;}


    @Override
    public void WriteSymptoms(Map<String, Integer> symptoms) {

        if (filepath != null) {
            try {
                // Création d'un fileWriter pour écrire dans le fichier
                FileWriter fileWriter = new FileWriter("result.out", false);

                // Création d'un bufferedWriter qui utilise le fileWriter
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                // Ecriture des symptoms
                symptoms.forEach((key, value) -> {
                    try {
                        bufferedWriter.write(key + ":" + value);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });

                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
