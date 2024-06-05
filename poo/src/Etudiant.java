import java.sql.Date;

public class Etudiant extends Individu {
    Date dateInscription;
    String niveauEtude;

    public Etudiant(String nom, String prenom, int identifiant, Date dateInscription, String niveauEtude) {
        super(nom, prenom, identifiant);
        this.dateInscription = dateInscription;
        this.niveauEtude = niveauEtude;
    }

    public void montrerDetails() {
        System.out.println(
                "\nNom: " + this.nom +
                        "\nPrenom: " + this.prenom +
                        "\nIdentifiant : " + this.identifiant +
                        "\nDate d'inscription: " + this.dateInscription +
                        "\nNiveau d'étude: " + this.niveauEtude);
    }
}
