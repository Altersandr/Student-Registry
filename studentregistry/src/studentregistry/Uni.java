package studentregistry;

import java.util.ArrayList;

public class Uni {

	private static ArrayList<String[]> students = new ArrayList<String[]>(); // ArrayList dove conservo tutti i studenti

	public static void registerStudent(String first, String last) { // metodo per aggiungere uno studente nel ArrayList

		Student newStudent = new Student(first, last);
		students.add(new String[] { newStudent.firstName, newStudent.lastName, newStudent.id }); // prendo i dati inseriti dal utente e creo un Array con quelli dati e l'id generato 
																								// che aggiungo al arraylist

	}

	public static void getAllStudents() { // metodo per stampare l'elenco studenti
		for (String[] student : students) {
			System.out.println("Studente " + student[0] + " " + student[1] + " con l'ID " + student[2]);
		}
	}

	public static void getStudent(String id) { // metodo per cercare studente con l'id passato nel argomento del metodo
		boolean found = false;
		for (String[] student : students) {
			if (student[2].equals(id)) {
				System.out.println(
						"E stato trovato lo studente " + student[0] + " " + student[1] + " con l'ID " + student[2]);
				found = true;
				break;
			}
		}
		if (!found)
			System.out.println("Studente con l'ID indicato non esiste!");
	}
}
