package P2Mbackend.backendp2m.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="recette healthy")
@Data
public class recettehealthy {
    @Id
    @Column(name="id")
    private Long id;
    @Column(name="nom")
    private String nom;
    @Column(name="ingredients")
    private String ingredients;
    @Column(name="instructions")
    private String instructions;



        public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
