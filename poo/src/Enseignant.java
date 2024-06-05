public class Enseignant extends Individu {
    String specialisation;
    double salaireMensuel;

    public Enseignant(String nom, String prenom, int identifiant, String specialisation, double salaireMensuel) {
        super(nom, prenom, identifiant);
        this.specialisation = specialisation;
        this.salaireMensuel = salaireMensuel;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public double getSalaireMensuel() {
        return salaireMensuel;
    }

    public void setSalaireMensuel(double salaireMensuel) {
        this.salaireMensuel = salaireMensuel;
    }

    public void montrerDetails() {
        System.out.println(
                "\nEnseignant n° " + this.identifiant +
                        "\nNom: " + this.nom +
                        "\nPrenom: " + this.prenom +
                        "\nSpécialisation : " + this.specialisation +
                        "\nSalaire Mensuel: " + this.salaireMensuel);
    }
}
