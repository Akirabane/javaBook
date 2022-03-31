package fr.akirabane.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static final String FILE_PATH = "your file path";
	
	public static Scanner sc = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);
		
		String userLastName = getUserInput("Entrez un nom:");
		String userFirstName = getUserInput("Entrez un prenom:");
		String userPhoneNumber = getUserInput("Entrez un num de tél:");
		
		Contact newContact = new Contact(userLastName, userFirstName, userPhoneNumber);
		System.out.println(newContact.toString());
		
		File phoneBook = getOrCreateFile(FILE_PATH);
		appendContactToBook(phoneBook, newContact);
		
		sc.close();
	}
	
	public static String getUserInput(String req) {
		
		if(req == null || sc == null) {
			sc.close();
		}
		
		System.out.println(req);
		return sc.nextLine();
	}
	
	public static File getOrCreateFile(String FilePath) {
		File phoneBook = new File(FilePath);
			if(phoneBook.exists()) {
				return phoneBook;
			}
			
			try {
				phoneBook.createNewFile();
				System.out.println("Fichier créé ici: " + FilePath);
				return phoneBook;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;	
	}
	
	public static void appendContactToBook(File phoneBook, Contact newContact) {
		try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter(phoneBook, true))) {
			fileWriter.append(newContact.toString());
			fileWriter.append('\n');
			System.out.println("Contact ajouté!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
