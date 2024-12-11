package studentregistry;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Uni uni = new Uni(); // sto instanziando la classe Uni

		System.out.println(
				"Benvenuto!\nChe azione vuoi eseguire?\n1. Aggiungere uno studente\n2. Visualizzare tutti gli studenti\n3. Cercare uno studente(con l'ID)\n0. Uscire dal programma");
		int choice = scan.nextInt();
		scan.nextLine();
		String response = "";

		while (true) {
			if (response.equals("si")) {
				System.out.println(
						"Che azione vuoi eseguire?\n1. Aggiungere uno studente\n2. Visualizzare tutti gli studenti\n3. Cercare uno studente(con l'ID)\n0. Uscire dal programma");
				choice = scan.nextInt();
				scan.nextLine();
			}

			if (choice == 0 || choice > 3 || choice < 0) // se l'utente non iserisce un numero da 0 a 3 esco dal programma
				break;
			else if (choice == 1) {
				System.out.println("Il nome del studente che vuoi aggiungere?");
				String firstName = scan.next();
				System.out.println("Il cognome del studente che vuoi aggiungere?");
				String lastName = scan.next();
				uni.registerStudent(firstName, lastName); // raccoglo i dati inseriti e li passo al metodo che registra i studenti
			} 
			else if (choice == 2)
				uni.getAllStudents(); // stampo l'elenco studenti
			else if (choice == 3) {
				System.out.println("Inserisci l'ID dello studente che vuoi cercare: ");
				String id = scan.nextLine();
				uni.getStudent(id); // cerco studente
			}
			System.out.println("Vuoi fare altro?");
			response = scan.next().toLowerCase();
			
			if (!response.equals("si") && response.length() > 0) // se l'utente inserisce qualsiasi cosa che non sia un "si", esco dal programma
				System.exit(0);

		}
		scan.close();

	}

}
