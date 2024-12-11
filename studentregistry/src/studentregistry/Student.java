package studentregistry;

public class Student {
	
	String firstName;
	String lastName;
	String id;
	
	private static int idCounter = 0; // contatore che serve alla generazione del ID

	private static String createID() { // metodo per creare l'ID
		return String.valueOf(idCounter++);
	}
	

	public Student(String first, String last) { // costruttore Studente
		this.firstName = first;
		this.lastName = last;
		this.id = createID();
	}
}
