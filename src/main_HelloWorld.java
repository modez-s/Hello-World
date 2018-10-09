/**
 * @author Sebastien Maudet - IUT RT La Roche sur Yon
 * Cette application a été développé dans un environnement JAVA 8 sous eclipse
 * Application permettant d'afficher "Hello World"
*/

import javax.swing.JOptionPane;

public class main_HelloWorld {

	// Méthode principale de l'application
	public static void main(String[] args) {
		// Afficher dans la console, le texte "Hello la LP DIP"
		System.out.println("Hello la LP DIP !!!");

		// Afficher dans une fenêtre le texte "En direct de LR"
		JOptionPane.showMessageDialog(null, "En direct de La Roche sur Yon");
	}
}
