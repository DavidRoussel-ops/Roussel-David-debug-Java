package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

    private String filepath;

    public WriteSymptomDataToFile(String filepath) {this.filepath = filepath;}

    @Override
    public Map<String, Integer> postSymptoms() {
        ArrayList<String> result = new ArrayList<>();

        if (filepath != null) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filepath, false));

                writer.write("Liste des symptoms");

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
