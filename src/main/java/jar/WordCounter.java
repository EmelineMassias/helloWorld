package jar;

/**
 * Hello world!
 *
 */

public class WordCounter {
    
    // Méthode qui prend une phrase en paramètre et retourne le nombre de mots
    public static int wordsCount(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return 0; // Si la phrase est vide ou nulle, renvoie 0
        }
        // Utilisation de split pour diviser la phrase en mots en fonction des espaces
        String[] words = phrase.trim().split("\\s+");
        return words.length;
    }


// Méthode qui prend un mot en paramètre et retourne le mot inversé
public static String reverser(String mot) {
    if (mot == null || mot.isEmpty()) {
        return ""; // Si le mot est vide ou nul, renvoie une chaîne vide
    }
    // Utilisation de StringBuilder pour inverser le mot
    return new StringBuilder(mot).reverse().toString();
}

// Méthode qui vérifie si un mot est un palindrome
public static boolean palindromic(String mot) {
    if (mot == null || mot.isEmpty()) {
        return false; // Si le mot est vide ou nul, il ne peut pas être un palindrome
    }
    // Comparer le mot original avec sa version inversée
    return mot.equalsIgnoreCase(reverser(mot));
}

public static void main(String[] args) {
    String phrase = "As you walk on the way, the way appears";
    System.out.println("Nombre de mots: " + wordsCount(phrase));
    
    String mot = "hello";
    System.out.println("Mot inversé: " + reverser(mot));
    
    String palindrome = "radar";
    System.out.println("Le mot 'radar' est un palindrome : " + palindromic(palindrome));
    

	}
}