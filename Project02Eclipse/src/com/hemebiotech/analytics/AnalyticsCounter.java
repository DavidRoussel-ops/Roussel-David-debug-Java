package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	public static void main(String[] args) throws Exception {
		try {
			List<String> result = new ArrayList<>();
			Map<String, Integer> map = new TreeMap<>();
			ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("C:/Roussel-David-debug-Java/Project02Eclipse/symptoms.txt");
			result = readSymptomDataFromFile.GetSymptoms();
			CalculOccurences calculOccurences = new CalculOccurences();
			map = calculOccurences.CalculSymptoms(result);
			WriteSymptomDataToFile writeSymptomDataToFile = new WriteSymptomDataToFile("result.out");
			writeSymptomDataToFile.WriteSymptoms(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
