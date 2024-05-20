package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public List<String> GetSymptoms() {
		// Instance de l'objet ArrayList.
		ArrayList<String> result = new ArrayList<String>();
		// Condition si le ficher est différent à null.
		if (filepath != null) {
			try {
				// Instance de l'objet BufferedReader avec l'objet FileReader.
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				// Variable line qui utilise la méthode readLine de BufferedReader.
				String line = reader.readLine();
				// Boucle "tant que" line est différent de null.
				while (line != null) {
					//Utilisation de la méthode ".add()" pour ajouté chaque line.
					result.add(line);
					line = reader.readLine();
				}
				// Fermeture du reader.
				reader.close();
			} catch (IOException e) {
				// Gestion de l'exception qui affichera une trace dans le fichier log.
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
