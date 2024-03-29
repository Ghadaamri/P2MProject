package P2Mbackend.backendp2m.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "mesure sante")
@Data
public class mesuresante {
    @Id
    @Column(name="id")
    private  Long id;
    @Column(name="nom utilisateur")
    private  String nom_utilisateur;
    @Column(name="Date")
    private LocalDate date;
    @Column (name="type de mesure")
    private  typemesure type ;
    @Column(name="valeur de mesure")
    private float valeur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public typemesure getType() {
        return type;
    }

    public void setType(typemesure type) {
        this.type = type;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }
}
