package exemple;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


public class Etudiant {
    public Etudiant(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom;
}
