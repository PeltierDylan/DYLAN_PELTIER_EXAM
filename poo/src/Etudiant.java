import java.util.ArrayList;
import java.util.Date;

public class Etudiant extends Individu {
    Date dateInscription;
    String niveauEtude;
    ArrayList<Cours> coursList = new ArrayList<Cours>();

    public Etudiant(String nom, String prenom, int identifiant, Date dateInscription, String niveauEtude) {
        super(nom, prenom, identifiant);
        this.dateInscription = dateInscription;
        this.niveauEtude = niveauEtude;
    }

    public void montrerDetails() {
        System.out.println(
                "\nEtudiant n° " + this.identifiant +
                        "\nNom: " + this.nom +
                        "\nPrenom: " + this.prenom +
                        "\nDate d'inscription: " + this.dateInscription +
                        "\nNiveau d'étude: " + this.niveauEtude);
    }

    public void participer(Cours cours) {
        if (!this.coursList.contains(cours)) {
            System.out.println(
                    "L'élève " + this.nom + " " + this.prenom +
                            " participe au cours de " + cours.getTitre());
            this.coursList.add(cours);
            cours.placesRestantes--;
        } else {
            System.out.println("L'élève " + this.nom + " " + this.prenom +
                    " participe déjà au cours de " + cours.getTitre());
        }
    }

    public void quitter(Cours cours) {
        if (!this.coursList.contains(cours)) {
            System.out.println(
                    "L'élève " + this.nom + " " + this.prenom +
                            " a quitté le cours de " + cours.getTitre());
            this.coursList.remove(cours);
            cours.placesRestantes++;
        } else {
            System.out.println("L'élève " + this.nom + " " + this.prenom +
                    " ne participe pas au cours de " + cours.getTitre());
        }
    }
}
