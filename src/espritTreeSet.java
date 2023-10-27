import java.util.Comparator;
import java.util.TreeSet;
class EspritTreeSet implements GestionEnseignant {
    private TreeSet<Enseignant> enseignants = new TreeSet<>(Comparator.comparingInt(Enseignant::getId));

    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignants.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        Enseignant e = new Enseignant();
        e.setId(id);
        return enseignants.contains(e);
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for (Enseignant e : enseignants) {
            System.out.println(e);
        }
    }
}

