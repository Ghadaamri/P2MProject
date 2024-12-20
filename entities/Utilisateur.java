package P2Mbackend.backendp2m.entities;

import jakarta.persistence.*;
import lombok.*;
             import java.util.UUID;


import java.time.LocalDate;

import static jakarta.persistence.GenerationType.*;

@Setter
@Getter

@NoArgsConstructor

@Entity
@Table(name = "utilisateur")
@Data
public class Utilisateur {
    @Id
    @GeneratedValue
    private UUID id;
    @Column(name = "mdp")
    private String mdp;
    @Column(name = "nom", columnDefinition = "TEXT")
    private String nom;
    @Column(name = "prenom", columnDefinition = "TEXT")
    private String prenom;
    @Column(name = "adressemail", columnDefinition = "TEXT")
    private String adressemail;
    @Column(name = "datenaissance", columnDefinition = "TEXT")
    private LocalDate datenaissance;

}

















































    


