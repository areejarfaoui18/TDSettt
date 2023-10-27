public class Main {
    public static void main(String[] args) {
        // Create some instances of Enseignant
        Enseignant enseignant1 = new Enseignant(1, "Doe", "John");
        Enseignant enseignant2 = new Enseignant(2, "Smith", "Jane");
        Enseignant enseignant3 = new Enseignant(3, "Doe", "Jane");

        // Create an instance of EspritHashSet
        EspritHashSet espritHashSet = new EspritHashSet();

        // Add Enseignant objects to the HashSet
        espritHashSet.ajouterEnseignant(enseignant1);
        espritHashSet.ajouterEnseignant(enseignant2);
        espritHashSet.ajouterEnseignant(enseignant3);

        // Display all Enseignants
        System.out.println("Enseignants in HashSet:");
        espritHashSet.displayEnseignants();

        // Search for an Enseignant
        System.out.println("Recherche 1: " + espritHashSet.rechercherEnseignant(enseignant1));
        System.out.println("Recherche 4: " + espritHashSet.rechercherEnseignant(4));

        // Remove an Enseignant
        espritHashSet.supprimerEnseignant(enseignant2);

        // Display updated list
        System.out.println("Updated Enseignants in HashSet:");
        espritHashSet.displayEnseignants();

        // Create an instance of EspritTreeSet
        EspritTreeSet espritTreeSet = new EspritTreeSet();

        // Add Enseignant objects to the TreeSet
        espritTreeSet.ajouterEnseignant(enseignant1);
        espritTreeSet.ajouterEnseignant(enseignant2);
        espritTreeSet.ajouterEnseignant(enseignant3);

        // Display all Enseignants
        System.out.println("Enseignants in TreeSet:");
        espritTreeSet.displayEnseignants();

        // Search for an Enseignant
        System.out.println("Recherche 1: " + espritTreeSet.rechercherEnseignant(enseignant1));
        System.out.println("Recherche 4: " + espritTreeSet.rechercherEnseignant(4));

        // Remove an Enseignant
        espritTreeSet.supprimerEnseignant(enseignant2);

        // Display updated list
        System.out.println("Updated Enseignants in TreeSet:");
        espritTreeSet.displayEnseignants();
    }
}
