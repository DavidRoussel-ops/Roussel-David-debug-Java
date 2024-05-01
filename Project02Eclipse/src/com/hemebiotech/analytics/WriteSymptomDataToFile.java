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
    public Map<String, Integer> writeSymptoms() {
        ArrayList<String> result = new ArrayList<>();

        if (filepath != null) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filepath, false));
                String line = writer.toString();

                writer.write("Liste des symptoms");
                writer.newLine();
                while (line != null) {
                    result.add(line);
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return (Map<String, Integer>) result;
    }
}
