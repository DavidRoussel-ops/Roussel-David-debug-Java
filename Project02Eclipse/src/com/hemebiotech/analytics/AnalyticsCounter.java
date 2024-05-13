package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;
	private final ISymptomReader reader;
	private final ISymptomWriter writer;

	// Constructeur pour les class ISymptomReader et ISymptomWriter
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}
	
	public static void main(String[] args) throws Exception {

		// Méthode getSymptoms pour récupérer la liste des entrées dans le fichier
		public List<String> getSymptoms("symptoms.txt") {}

		// Méthode countSymptoms qui va conter les occurences de chaque symptoms existant dans la liste
		public Map<String, Integer> countSymptoms(List<String> symptoms) {}

		// Méthode sortSymptoms qui va trié la liste de symptoms et d'occurences par ordre alphabétique
		public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {}

		// Méthode writeSymptoms qui écrit le résultat dans le fichier de sortie en utilisant l'instance de ISymptomWriter
		public void writeSymptoms(Map<String, Integer> symptoms) {}

	}
}
