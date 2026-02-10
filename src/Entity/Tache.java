package Entity;

import java.time.LocalDate;

public class Tache {
   private  String description ;
    private String nom;
    private String prenom;

    public String getMaxTime() {
        return MaxTime;
    }

    public void setMaxTime(String maxTime) {
        MaxTime = maxTime;
    }

    private String MaxTime;

    public Tache(String description, String nom, String prenom ,  String maxTime) {
        this.description = description;
        this.nom = nom;
        this.prenom = prenom;
        this.MaxTime = maxTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    private enum EtatTache{
        DONE,
        ENCOURS,
        NOTSTART
    }
}
