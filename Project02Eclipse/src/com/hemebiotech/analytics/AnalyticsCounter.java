package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	public static void main(String[] args) throws Exception {
		try {
			// Instance qui permet de retourné un ArrayList.
			List<String> result = new ArrayList<>();
			// Instance qui permet de retourné un Map dans l'ordre alphabétique.
			Map<String, Integer> map = new TreeMap<>();
			// Instance de la class ReadSymptomDataFromFile qui vient lire le fichier texte.
			ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("C:/Roussel-David-debug-Java/Project02Eclipse/symptoms.txt");
			// Utilisation de la méthode GetSymptoms de la class ReadSymptomDataFromFile pour la stocké dans la liste result.
			result = readSymptomDataFromFile.GetSymptoms();
			// Instance de la class CalculOccurences qui vient calculer le nombres d'occurence d'une liste.
			CalculOccurences calculOccurences = new CalculOccurences();
			// Utilisation de la méthode CalculSymptoms de la class CalculOccurences sur la liste result.
			map = calculOccurences.CalculSymptoms(result);
			// Instance de la class WriteSymptomDataToFile qui vient écrire dans le fichier resoult.out.
			WriteSymptomDataToFile writeSymptomDataToFile = new WriteSymptomDataToFile("result.out");
			// Utilisation de la méthode WriteSymptoms qui vient écrire dans le fichier result.out le contenu d'une Map.
			writeSymptomDataToFile.WriteSymptoms(map);
		} catch (Exception e) {
			// Gestion de l'exception qui affichera une trace dans le fichier log.
			e.printStackTrace();
		}
    }
}
