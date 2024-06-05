import java.sql.Date;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Etudiant ind1 = new Etudiant("Peltier", "Dylan", 1, new Date(2023, 9, 1), "Licence");
        Cours cours1 = new Cours("Français", "Fleury", 2, 2);
        System.out.println();
        ind1.montrerDetails();
        cours1.montrerDetails();

    }

}
