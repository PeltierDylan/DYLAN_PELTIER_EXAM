import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        ArrayList<Individu> individus = new ArrayList<Individu>();
        ArrayList<Cours> coursList = new ArrayList<Cours>();

        individus.add(new Enseignant("Fleury", "Sebastien", 1, "Mathématiques", 2000));
        individus.add(new Etudiant("Peltier", "Dylan", 2, new Date(2024, 2, 23), "Licence"));
        individus.add(new Etudiant("Larde", "thomas", 1, new Date(2023, 9, 12), "Licence"));
        individus.add(new Enseignant("Barbier", "Gael", 2, "Programmation", 1900));
        individus.add(new Etudiant("Florella", "Vincent", 3, new Date(2024, 9, 1), "BTS"));

        coursList.add(new Cours("Français", "Fleury", 2, 2));
        coursList.add(new Cours("maTH", "Fleury", 2, 2));
        coursList.add(new Cours("Prog", "Fleury", 2, 2));

        System.out.println();

        for (int i = 0; i != individus.size(); i++) {
            individus.get(i).montrerDetails();
        }
        for (int i = 0; i != coursList.size(); i++) {
            coursList.get(i).montrerDetails();
        }
        // individus.get(1).participer(coursList.get(0));
    }

}
