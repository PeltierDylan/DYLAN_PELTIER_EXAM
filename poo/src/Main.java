import java.util.Date;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Individu[] individus = new Individu[5];
        individus[0] = new Enseignant("Fleury", "Sebastien", 1, "Mathématiques", 2000);
        individus[1] = new Etudiant("Peltier", "Dylan", 2, new Date(2024, 2, 23), "Licence");
        individus[2] = new Etudiant("Larde", "thomas", 1, new Date(2023, 9, 12), "Licence");
        individus[3] = new Enseignant("Barbier", "Gael", 2, "Programmation", 1900);
        individus[4] = new Etudiant("Florella", "Vincent", 3, new Date(2024, 9, 1), "BTS");
        Cours cours1 = new Cours("Français", "Fleury", 2, 2);

        cours1.montrerDetails();
        System.out.println();

        for (int i = 0; i != individus.length; i++) {
            individus[i].montrerDetails();
        }
    }

}
